package youget;


import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import it.sauronsoftware.jave.MultimediaInfo;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
public class MyMain {
	private static Timer timer;
	private static TimerTask task;
	private static long min1, min2, musictime, nowplaytime;
	private static Player player;
	private static FileInputStream openmusicfile;
	private static boolean playing, playmusic, jslset;
	private static String savepath = "F:\\desktop", playpath;
	static String musicformat[]= {".m4a",".mp3",".mp2",".wav"};
	public static boolean ismusic(String name)
	{
		for(String h:musicformat)
		{
			if(name.indexOf(h)!=-1)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		playing = false;
		playmusic = false;
		jslset = false;
		File fp = new File("path.txt");
		if (!fp.exists()) {
			try {
				FileOutputStream fo = new FileOutputStream(fp);
				fo.write(savepath.getBytes());
				fo.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else {
			try {
				FileInputStream fi = new FileInputStream(fp);
				byte tss[] = new byte[256];
				fi.read(tss);
				fi.close();
				int len = 0;
				for (int i = 0; i < 256; i++) {
					if (tss[i] == 0)
						break;
					len++;
				}
				savepath = new String(tss, 0, len);
				tss = null;
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		List<PT> t = new ArrayList<PT>();
		JFrame jf = new JFrame("hifini");
		jf.setIconImage(new ImageIcon(MyMain.class.getResource("logo.png")).getImage());
		jf.setBounds(0, 0, 600, 600);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		JList jl = new JList();
		jl.setModel(dlm);
		jl.setFixedCellHeight(40);
		jl.setCellRenderer(new DefaultListCellRenderer() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(new Color(238, 238, 238));
				g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
			}
		});
		jl.setSelectionBackground(new Color(7, 188, 252, 150));
		jl.setBounds(0, 0, 575, 400);
		JScrollPane js = new JScrollPane(jl);
		jf.add(js);
		js.setBounds(10, 60, 575, 400);
		JTextField jt = new JTextField();
		jt.setBounds(6, 15, 500, 30);
		jf.add(jt);
		JButton jb = new JButton("搜索");
		jb.setBounds(510, 6, 75, 40);
		jf.add(jb);
		JLabel ja = new JLabel("就绪！");
		JButton down = new JButton("下载");
		down.setBounds(30, 510, 60, 40);
		JSlider jsl = new JSlider();
		JLabel showtime = new JLabel("00:00/00:00", JLabel.CENTER);
		jl.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getButton()!=MouseEvent.BUTTON1)
					return;
				if (!playing)
					return;
				min1 = System.currentTimeMillis();
				if (min1 - min2 < 500) {
					int h = jl.getSelectedIndex();
					if (!playmusic)
						down.setText("停止");
					playmusic = true;
					PT ts = t.get(h);
					changefile cf = new changefile(t, ts, ja, showtime, jsl, down, dlm, h);
					new Thread(cf).start();

				}
				min2 = min1;
			}
		});
		jb.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				if (playing) {
					down.setText("下载");
					playing = false;
				}
				t.clear();
				dlm.clear();
				String name = jt.getText().toString();
				ja.setText("正在搜索：" + name);
				jb.setEnabled(false);
				new Thread(new Runnable() {

					@Override
					public void run() {

						WebGet.search(name, t);
						for (int i = 0; i < t.size(); i++) {
							PT tk = t.get(i);
							int x = tk.title.indexOf("[");
							if (x != -1) {
								tk.title = tk.title.substring(0, x);
								t.set(i, tk);
							}
						}
						for (PT tk : t) {
							dlm.addElement(tk.title);
						}
						jb.setEnabled(true);
						ja.setText("搜索：" + t.size() + "条结果");
					}
				}).start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		jt.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t.clear();
					dlm.clear();
					String name = jt.getText().toString();
					ja.setText("正在搜索：" + name);
					jb.setEnabled(false);
					new Thread(new Runnable() {

						@Override
						public void run() {

							WebGet.search(name, t);

							for (int i = 0; i < t.size(); i++) {
								PT tk = t.get(i);
								int x = tk.title.indexOf("[");
								if (x != -1) {
									tk.title = tk.title.substring(0, x);
									t.set(i, tk);
								}
							}
							for (PT tk : t) {
								dlm.addElement(tk.title);
							}
							jb.setEnabled(true);
							ja.setText("搜索：" + t.size() + "条结果");
						}
					}).start();
				}
			}
		});
		/*
		 * jsl.addMouseListener(new MouseListener() {
		 * 
		 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
		 * method stub nowplaytime=jsl.getValue(); try { player.close(); player=new
		 * Player(new FileInputStream(playpath)); player.play((int)nowplaytime); } catch
		 * (JavaLayerException | FileNotFoundException e1) { // TODO Auto-generated
		 * catch block e1.printStackTrace(); } jslset=false; }
		 * 
		 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
		 * method stub jslset=true; }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * }
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * }
		 * 
		 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
		 * method stub
		 * 
		 * } });
		 */
		JTextField jt1 = new JTextField();
		down.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// down.setEnabled(false);
				int h = jl.getSelectedIndex();
				if (h == -1) {
					if (playmusic) {
						playmusic = false;
						if (playing) {
							down.setText("播放");
							player.close();
							player = null;
							timer.cancel();
							task.cancel();
							timer = null;
							task = null;
						}
					}
					ja.setText("警告：没有选中执行的目标！");
					return;
				}
				PT ts = t.get(h);
				if (playing) {
					if (playmusic) {
						down.setText("播放");
						playmusic = false;
						player.close();
						player = null;
						timer.cancel();
						task.cancel();
						timer = null;
						task = null;
					} else {
						playmusic = true;
						changefile cf = new changefile(t, ts, ja, showtime, jsl, down, dlm, h);
						new Thread(cf).start();
					}
				} else {
					ja.setText("正在下载：" + ts.title);
					ts.title = ts.title.replace("\\", " ");
					ts.title = ts.title.replace("/", " ");
					new Thread(new Runnable() {

						@Override
						public void run() {
							String filepath = jt1.getText();
							File file = new File(filepath);
							if (!file.exists()) {
								file = null;
								ja.setText("警告：保存路径不可访问！");
								return;
							}
							file = null;
							if (!filepath.equals(savepath)) {
								savepath = filepath;
								try {
									FileOutputStream fo = new FileOutputStream(fp);
									fo.write(savepath.getBytes());
									fo.close();
								} catch (FileNotFoundException e1) {
									e1.printStackTrace();
								} catch (IOException e1) {
									e1.printStackTrace();
								}
							}
							filepath += "/" + ts.title + ".m4a";
							WebGet.you_get(ts.url, filepath);
							ja.setText("已保存：" + filepath);
							// down.setEnabled(true);
						}
					}).start();
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		jf.add(down);
		jt1.setBounds(10, 470, 500, 30);
		jt1.setText(savepath);
		jf.add(jt1);
		jsl.setBounds(95, 510, 400, 20);
		jsl.setMinimum(0);
		jsl.setMaximum(100);
		jsl.setValue(0);
		jf.add(jsl);
		showtime.setBounds(480, 503, 100, 30);
		jf.add(showtime);
		ja.setBounds(120, 510, 400, 60);
		jf.add(ja);
		JButton exp = new JButton();
		exp.setBounds(520, 470, 30, 30);
		exp.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					File f = new File(savepath);
					if (!f.exists()) {
						f = null;
						return;
					}
					Desktop.getDesktop().open(f);
					f = null;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		exp.setIcon(new ImageIcon(MyMain.class.getResource("file.jpg")));
		jf.add(exp);
		JButton pos = new JButton();
		pos.setBounds(560, 470, 30, 30);
		pos.setIcon(new ImageIcon(MyMain.class.getResource("music.jpg")));
		pos.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if (!playing) {
					down.setText("播放");
					playing = true;
				}
				File f = new File(savepath);
				if (!f.exists()) {
					f = null;
					return;
				}
				dlm.clear();
				t.clear();
				for (String i : f.list()) {
					if(ismusic(i))
					{
					t.add(new PT(i, savepath + "/" + i));
					dlm.addElement(i);
					}
				}
				f = null;
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		jf.add(pos);
		jf.repaint();
		jt.repaint();
		// jl.repaint();
		jt.requestFocus();
		// jf.repaint();
	}

	public static class changefile implements Runnable {
		List<PT> t;
		PT ts;
		JLabel ja, showtime;
		JSlider jsl;
		JButton down;
		DefaultListModel<String> dlm;
		int sel;

		public changefile(List<PT> t, PT ts, JLabel ja, JLabel showtime, JSlider jsl, JButton down,
				DefaultListModel<String> dlm, int sel) {
			// TODO Auto-generated constructor stub
			this.t = t;
			this.ts = ts;
			this.ja = ja;
			this.down = down;
			this.dlm = dlm;
			this.sel = sel;
			this.showtime = showtime;
			this.jsl = jsl;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

			if (timer != null) {
				timer.cancel();
				task.cancel();
				timer = null;
				task = null;
			}
			if (player != null) {
				if (!player.isComplete()) {
					if (openmusicfile != null) {
						try {
							openmusicfile.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						openmusicfile = null;
					}
					player.close();
				}
				player = null;
				if (openmusicfile != null) {
					try {
						openmusicfile.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					openmusicfile = null;
				}
			}
			musictime = getmusictime(ts.url) / 1000;

			try {
				boolean zh = changeLocalSourceToMp3(ts.url, down, ja);
				if (zh) {
					for (int i = ts.url.length() - 1; i >= 0; i--) {
						if (ts.url.charAt(i) == '.') {
							ts.url = ts.url.substring(0, i);
							ts.url += ".mp3";
							break;
						}
					}
					for (int i = ts.title.length() - 1; i >= 0; i--) {
						if (ts.title.charAt(i) == '.') {
							ts.title = ts.title.substring(0, i);
							ts.title += ".mp3";
							t.set(sel, ts);
							dlm.set(sel, ts.title);
							break;
						}
					}
					down.setEnabled(true);
				}
				playpath = ts.url;
				openmusicfile = new FileInputStream(ts.url);
				jsl.setMaximum((int) musictime);
				showtime.setText(String.format("00:00/%02d:%02d", musictime / 60, (musictime % 60)));
				ja.setText("此音频时长为:" + musictime / 60 + "分" + (musictime % 60) + "秒！");
				timer = new Timer(false);
				task = new TimerTask() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						nowplaytime++;
						if (nowplaytime >= musictime) {
							down.setText("播放");
							playmusic = false;
							nowplaytime = 0;
							jsl.setValue(0);
							showtime.setText(String.format("00:00/%02d:%02d", musictime / 60, (musictime % 60)));
							timer.cancel();
							task.cancel();
							return;
						}
						if (!jslset)
							jsl.setValue((int) (nowplaytime));
						showtime.setText(String.format("%02d:%02d/%02d:%02d", nowplaytime / 60, (nowplaytime % 60),
								musictime / 60, (musictime % 60)));
					}
				};
				nowplaytime = 0;
				jsl.setValue((int) (nowplaytime));
				timer.schedule(task, 1000, 1000);
				player = new Player(openmusicfile);
				down.setText("停止");
				player.play();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			down.setEnabled(true);
		}

	}

	public static long getmusictime(String path) {
		File source = new File(path);
		if (!source.exists()) {
			source = null;
			return 0;
		}
		Encoder encoder = new Encoder();
		long ls = 0;
		try {
			MultimediaInfo m = encoder.getInfo(source);
			ls = m.getDuration();
			// System.out.println();
		} catch (InputFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

	public static boolean changeLocalSourceToMp3(String localFilePath, JButton down, JLabel debug) throws Exception {
		if (localFilePath.indexOf(".mp3", localFilePath.length() - 5) != -1)
			return false;
		down.setEnabled(false);
		debug.setText("正在转码：" + localFilePath);
		File source = new File(localFilePath);
		String targetPath = null;
		for (int i = localFilePath.length() - 1; i >= 0; i--) {
			if (localFilePath.charAt(i) == '.') {
				targetPath = localFilePath.substring(0, i);
				targetPath += ".mp3";
				break;
			}
		}
		File target = new File(targetPath);

		AudioAttributes audio = new AudioAttributes();

		Encoder encoder = new Encoder();
		audio.setCodec("libmp3lame");
		audio.setBitRate(new Integer(128000));// 音频流的比特率�??
		audio.setChannels(new Integer(2));// 声道
		audio.setSamplingRate(new Integer(44100));// 音频流的采样�?

		EncodingAttributes attrs = new EncodingAttributes();

		attrs.setFormat("mp3");

		attrs.setAudioAttributes(audio);

		encoder.encode(source, target, attrs);
		source.delete();
		debug.setText("音频已输出：" + targetPath);
		return true;
	}

}

