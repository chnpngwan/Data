package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import javax.swing.JTextField;
import javax.swing.JLabel;

public class MianFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MianFrame frame = new MianFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MianFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("添加商品信息");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				addGoods ag = new addGoods(null);
				ag.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		btnNewButton.setBounds(287, 437, 129, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 229, 700, 177);
		contentPane.add(scrollPane);
		
		table = new JTable();
		ExecuteStatement es = new ExecuteStatement();
		List<goodsList> allgoods =es.queryAll();
		Object [][] empObjs = new Object[allgoods.size()][5];
		for(int i=0;i<allgoods.size();i++) {
			empObjs[i][0] = allgoods.get(i).getStoreId();
			empObjs[i][1] = allgoods.get(i).getStoreName();
			empObjs[i][2] = allgoods.get(i).getUnitPrice();
			empObjs[i][3] = allgoods.get(i).getStoreNum();
			empObjs[i][4] = allgoods.get(i).getCreateDate();
		}
		table.setModel(new DefaultTableModel(
				empObjs,
			new String[] {
				"\u5546\u54C1\u7F16\u7801", "\u5546\u54C1\u540D\u79F0", "\u5355\u4EF7", "\u5E93\u5B58\u91CF", "\u521B\u5EFA\u65E5\u671F"
			}
		));
		table.getColumnModel().getColumn(4).setMinWidth(28);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(57, 52, 271, 106);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("查询");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindGoods fg = new FindGoods();
				fg.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1.setBounds(386, 52, 190, 106);
		contentPane.add(btnNewButton_1);
	}
}
