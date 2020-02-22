public class Hero{
    private String name;
    private float hp;
    private  int id;
    private int damage;

    //回血
    public synchronized void recover(){
        hp=hp+1;
    }

    //掉血
    public synchronized void hurt(){
        hp=hp-1;
    }

    public void attackHero(Hero h) {
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

    public int getId(){
        return id;
    }

    public void setId(int aid){
        id = aid;
    }

    public void setName(String aname){
        name = aname;
    }

    public String getName(){
        return name;
    }
    public void setHp(float ahp){
        hp = ahp;
    }

    public float getHp(){
        return hp;
    }

    public void setDamage(int adamage){
        damage = adamage;
    }

    public int getDamage(){
        return damage;
    }
}