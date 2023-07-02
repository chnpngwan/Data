package model;

/**
 * @author ChnpngWng
 *
 * @date   Nov 30, 20222:45:51 PM
 */
public class Hero {
	
	int hero_id;
	String equip_ids1;
	String tips1;
	String equip_ids2;
	String tips2;

	public Hero(int ro_id, String equip_ids1, String tips1, String equip_ids2, String tips2) {
		super();
		this.hero_id = hero_id;
		this.equip_ids1 = equip_ids1;
		this.tips1 = tips1;
		this.equip_ids2 = equip_ids2;
		this.tips2 = tips2;
	}
	public Hero() {
		super();
	}
	@Override
	public String toString() {
		return "Hero [ro_id=" + hero_id + ", equip_ids1=" + equip_ids1 + ", tips1=" + tips1 + ", equip_ids2=" + equip_ids2
				+ ", tips2=" + tips2 + "]";
	}

	public int getHero_id() {
		return hero_id;
	}

	public void setHero_id(int hero_id) {
		this.hero_id = hero_id;
	}

	public String getEquip_ids1() {
		return equip_ids1;
	}

	public void setEquip_ids1(String equip_ids1) {
		this.equip_ids1 = equip_ids1;
	}

	public String getTips1() {
		return tips1;
	}

	public void setTips1(String tips1) {
		this.tips1 = tips1;
	}

	public String getEquip_ids2() {
		return equip_ids2;
	}

	public void setEquip_ids2(String equip_ids2) {
		this.equip_ids2 = equip_ids2;
	}

	public String getTips2() {
		return tips2;
	}

	public void setTips2(String tips2) {
		this.tips2 = tips2;
	}
	
	
}
