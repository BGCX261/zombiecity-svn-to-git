/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapFive extends Map 
{
    private Worlds world;

    /**
     * Constructor for objects of class MapOne
     */
    public MapFive( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map5.png");
        world.addObject(this.gui, 350, 350);
        
        this.player.setLocation(125,688);
        this.player.addedToWorld( world );

        prepare();
    }
    
    public void prepare()
    {
        EnemyZombie enemyzombie = new EnemyZombie();
        world.addObject(enemyzombie, 292, 126);
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 493, 147);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 581, 182);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 408, 165);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 41, 107);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 54, 192);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 30, 244);
        EnemyZombie enemyzombie8 = new EnemyZombie();
        world.addObject(enemyzombie8, 618, 455);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 548, 409);
        EnemyZombie enemyzombie10 = new EnemyZombie();
        world.addObject(enemyzombie10, 377, 372);
        EnemyZombie enemyzombie11 = new EnemyZombie();
        world.addObject(enemyzombie11, 686, 589);
        EnemyZombie enemyzombie12 = new EnemyZombie();
        world.addObject(enemyzombie12, 509, 584);
        EnemyZombie enemyzombie13 = new EnemyZombie();
        world.addObject(enemyzombie13, 627, 392);
        EnemyZombie enemyzombie14 = new EnemyZombie();
        world.addObject(enemyzombie14, 219, 317);
        EnemyZombie enemyzombie15 = new EnemyZombie();
        world.addObject(enemyzombie15, 455, 420);
        EnemyZombie enemyzombie16 = new EnemyZombie();
        world.addObject(enemyzombie16, 256, 396);
        EnemyZombie enemyzombie17 = new EnemyZombie();
        world.addObject(enemyzombie17, 154, 383);
        EnemyZombie enemyzombie18 = new EnemyZombie();
        world.addObject(enemyzombie18, 43, 426);
        enemyzombie16.setLocation(351, 509);
        enemyzombie10.setLocation(279, 397);
        enemyzombie15.setLocation(361, 399);
        enemyzombie8.setLocation(345, 586);
        enemyzombie16.setLocation(391, 585);
        enemyzombie12.setLocation(450, 585);
        enemyzombie12.setLocation(538, 584);
        enemyzombie16.setLocation(479, 585);
        enemyzombie8.setLocation(441, 585);
        enemyzombie16.setLocation(489, 584);
        enemyzombie15.setLocation(297, 370);
        enemyzombie14.setLocation(251, 353);
        enemyzombie9.setLocation(484, 404);
        enemyzombie13.setLocation(542, 422);
        EnemyZombie enemyzombie19 = new EnemyZombie();
        world.addObject(enemyzombie19, 624, 392);
        enemyzombie19.setLocation(629, 409);
        
        TextTrigger textTrigger3 = new TextTrigger("Level 3 ",35);
        world.addObject(textTrigger3, 129, 661);
        
         Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 220, 124);
        invisiblewall.setLocation(218, 110);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 585, 231);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 457, 375);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 459, 243);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 572, 119);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 503, 137);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 641, 286);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 369, 121);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 404, 191);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 643, 378);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 536, 361);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 631, 433);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 507, 319);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 431, 245);
        Invisiblewall invisiblewall15 = new Invisiblewall();
        world.addObject(invisiblewall15, 327, 139);
        invisiblewall.setLocation(166, 112);
        invisiblewall15.setLocation(217, 113);
        invisiblewall15.setLocation(218, 114);
        invisiblewall8.setLocation(166, 171);
        invisiblewall9.setLocation(222, 171);
        invisiblewall15.setLocation(221, 113);
        invisiblewall14.setLocation(169, 206);
        invisiblewall4.setLocation(223, 205);
        invisiblewall6.setLocation(271, 263);
        invisiblewall5.setLocation(329, 261);
        invisiblewall5.setLocation(332, 261);
        invisiblewall6.setLocation(273, 262);
        invisiblewall13.setLocation(332, 281);
        invisiblewall3.setLocation(272, 287);
        invisiblewall2.setLocation(73, 273);
        invisiblewall11.setLocation(72, 295);
        invisiblewall7.setLocation(430, 31);
        invisiblewall10.setLocation(429, 56);
        invisiblewall12.setLocation(631, 433);
        invisiblewall12.setLocation(631, 433);
        invisiblewall12.setLocation(631, 433);
        invisiblewall12.setLocation(631, 433);
        invisiblewall12.setLocation(631, 433);
        invisiblewall12.setLocation(631, 433);
        invisiblewall12.setLocation(675, 653);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 617, 399);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 503, 338);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 522, 530);
        Invisiblewall invisiblewall19 = new Invisiblewall();
        world.addObject(invisiblewall19, 546, 562);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 609, 544);
        Invisiblewall invisiblewall21 = new Invisiblewall();
        world.addObject(invisiblewall21, 407, 593);
        Invisiblewall invisiblewall22 = new Invisiblewall();
        world.addObject(invisiblewall22, 570, 557);
        Invisiblewall invisiblewall23 = new Invisiblewall();
        world.addObject(invisiblewall23, 595, 497);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 568, 359);
        invisiblewall22.setLocation(618, 654);
        invisiblewall19.setLocation(562, 655);
        invisiblewall18.setLocation(503, 655);
        invisiblewall21.setLocation(443, 656);
        invisiblewall20.setLocation(391, 659);
        invisiblewall23.setLocation(342, 662);
        invisiblewall16.setLocation(290, 662);
        invisiblewall24.setLocation(234, 666);
        invisiblewall17.setLocation(25, 594);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 67, 473);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 425, 611);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 254, 568);
        invisiblewall27.setLocation(28, 650);
        invisiblewall26.setLocation(24, 682);
        Invisiblewall invisiblewall28 = new Invisiblewall();
        world.addObject(invisiblewall28, 66, 679);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 205, 680);
        invisiblewall29.setLocation(196, 680);
        invisiblewall11.setLocation(72, 297);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 107, 265);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 230, 357);
        invisiblewall30.setLocation(99, 258);
        invisiblewall31.setLocation(98, 288);
        
        Tree tree = new Tree();
        world.addObject(tree, 681, 124);
        Tree tree2 = new Tree();
        world.addObject(tree2, 676, 238);
        Tree tree3 = new Tree();
        world.addObject(tree3, 675, 309);
        Tree tree4 = new Tree();
        world.addObject(tree4, 513, 48);
        Tree tree5 = new Tree();
        world.addObject(tree5, 583, 47);
        Tree tree6 = new Tree();
        world.addObject(tree6, 662, 21);
        Tree tree7 = new Tree();
        world.addObject(tree7, 97, 170);
        Tree tree8 = new Tree();
        world.addObject(tree8, 169, 283);
        Tree tree9 = new Tree();
        world.addObject(tree9, 450, 280);
        Tree tree10 = new Tree();
        world.addObject(tree10, 512, 312);
        Tree tree11 = new Tree();
        world.addObject(tree11, 126, 63);
        tree11.setLocation(103, 76);
        tree8.setLocation(156, 278);
    }
    
    public void checkLevel()
    {
        List vijand = world.getObjects(Enemy.class);
        if ( ( this.player.getX() >= 285 && this.player.getX() <= 353 ) && this.player.getY() <= 30  && vijand.isEmpty()  )
        {
            this.world.removeObjects(this.world.getObjects(MapFive.class));
            this.world.cleanWorld();
            this.world.changeMap( 5 );
        }
    }
}
