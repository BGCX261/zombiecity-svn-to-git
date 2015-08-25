/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapSix extends Map 
{
    private Worlds world;

    /**
     * Constructor for objects of class MapOne
     */
    public MapSix( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map6.png");
        world.addObject(this.gui, 350, 350);
        
        this.player.setLocation(326,687);
        this.player.addedToWorld( world );

        
        
        prepare();
    }
    
    public void prepare()
    {
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 659, 107);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 583, 91);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 610, 141);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 621, 536);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 542, 457);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 567, 335);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 293, 276);
        EnemyZombie enemyzombie10 = new EnemyZombie();
        world.addObject(enemyzombie10, 373, 97);
        EnemyZombie enemyzombie11 = new EnemyZombie();
        world.addObject(enemyzombie11, 419, 421);
        enemyzombie10.setLocation(339, 137);
        enemyzombie4.setLocation(464, 318);
        EnemyZombie enemyzombie13 = new EnemyZombie();
        world.addObject(enemyzombie13, 280, 288);
        Invisiblewall invisiblewall99= new Invisiblewall();
        world.addObject(invisiblewall99, 227, 237);
        invisiblewall99.setLocation(218, 230);
        Tree tree = new Tree();
        world.addObject(tree, 651, 266);
        Tree tree2 = new Tree();
        world.addObject(tree2, 675, 348);
        Tree tree3 = new Tree();
        world.addObject(tree3, 126, 303);
        Tree tree4 = new Tree();
        world.addObject(tree4, 160, 626);
        Tree tree5 = new Tree();
        world.addObject(tree5, 101, 666);
        Tree tree6 = new Tree();
        world.addObject(tree6, 673, 694);
        Tree tree7 = new Tree();
        world.addObject(tree7, 293, 388);
        Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 677, 460);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 675, 522);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 664, 575);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 523, 366);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 564, 489);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 567, 302);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 475, 261);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 553, 343);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 564, 518);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 577, 525);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 638, 548);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 489, 549);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 524, 570);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 610, 618);
        Invisiblewall invisiblewall15 = new Invisiblewall();
        world.addObject(invisiblewall15, 655, 546);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 562, 581);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 590, 549);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 606, 525);
        invisiblewall7.setLocation(449, 209);
        invisiblewall6.setLocation(505, 209);
        invisiblewall8.setLocation(519, 209);
        invisiblewall4.setLocation(450, 240);
        invisiblewall5.setLocation(503, 239);
        invisiblewall10.setLocation(519, 241);
        invisiblewall9.setLocation(354, 493);
        invisiblewall12.setLocation(410, 493);
        invisiblewall13.setLocation(353, 514);
        invisiblewall12.setLocation(415, 496);
        invisiblewall9.setLocation(357, 497);
        invisiblewall13.setLocation(358, 513);
        invisiblewall16.setLocation(416, 516);
        invisiblewall18.setLocation(496, 491);
        invisiblewall17.setLocation(497, 519);
        invisiblewall15.setLocation(224, 410);
        invisiblewall11.setLocation(224, 462);
        invisiblewall14.setLocation(224, 504);
        invisiblewall3.setLocation(224, 550);
        invisiblewall2.setLocation(226, 597);
        invisiblewall2.setLocation(225, 597);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 589, 485);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 570, 577);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 417, 604);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 544, 623);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 295, 635);
        invisiblewall20.setLocation(218, 127);
        invisiblewall24.setLocation(219, 175);
        //invisiblewall19.setLocation(221, 230);
        invisiblewall26.setLocation(130, 86);
        invisiblewall27.setLocation(90, 87);
        invisiblewall25.setLocation(90, 142);
        Invisiblewall invisiblewall28 = new Invisiblewall();
        world.addObject(invisiblewall28, 481, 671);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 574, 569);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 484, 607);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 563, 659);
        invisiblewall29.setLocation(669, 511);
        invisiblewall.setLocation(665, 447);
        invisiblewall29.setLocation(666, 500);
        invisiblewall31.setLocation(667, 549);
        invisiblewall30.setLocation(667, 592);
        invisiblewall28.setLocation(102, 374);
        Invisiblewall invisiblewall32 = new Invisiblewall();
        world.addObject(invisiblewall32, 109, 435);
        Invisiblewall invisiblewall33 = new Invisiblewall();
        world.addObject(invisiblewall33, 538, 615);
        Invisiblewall invisiblewall35 = new Invisiblewall();
        world.addObject(invisiblewall35, 435, 638);
        Invisiblewall invisiblewall36 = new Invisiblewall();
        world.addObject(invisiblewall36, 559, 636);
        Invisiblewall invisiblewall37 = new Invisiblewall();
        world.addObject(invisiblewall37, 494, 606);
        invisiblewall37.setLocation(148, 372);
        invisiblewall32.setLocation(149, 394);
        invisiblewall35.setLocation(101, 426);
        invisiblewall33.setLocation(102, 481);
        invisiblewall36.setLocation(102, 517);
        Invisiblewall invisiblewall38 = new Invisiblewall();
        world.addObject(invisiblewall38, 134, 147);
        Invisiblewall invisiblewall39 = new Invisiblewall();
        world.addObject(invisiblewall39, 131, 201);
        Invisiblewall invisiblewall40 = new Invisiblewall();
        world.addObject(invisiblewall40, 98, 203);
        Invisiblewall invisiblewall41 = new Invisiblewall();
        world.addObject(invisiblewall41, 689, 195);
        invisiblewall41.setLocation(692, 179);
        Invisiblewall invisiblewall42 = new Invisiblewall();
        world.addObject(invisiblewall42, 691, 222);
        invisiblewall42.setLocation(694, 199);
        Invisiblewall invisiblewall43 = new Invisiblewall();
        world.addObject(invisiblewall43, 298, 89);
        Invisiblewall invisiblewall44 = new Invisiblewall();
        world.addObject(invisiblewall44, 285, 56);
        invisiblewall44.setLocation(281, 48);
        Invisiblewall invisiblewall45 = new Invisiblewall();
        world.addObject(invisiblewall45, 577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(577, 11);
        invisiblewall45.setLocation(678, 11);
        Invisiblewall invisiblewall46 = new Invisiblewall();
        world.addObject(invisiblewall46, 629, 9);
        Invisiblewall invisiblewall47 = new Invisiblewall();
        world.addObject(invisiblewall47, 577, 10);
        Invisiblewall invisiblewall48 = new Invisiblewall();
        world.addObject(invisiblewall48, 525, 5);
        Invisiblewall invisiblewall49 = new Invisiblewall();
        world.addObject(invisiblewall49, 472, 4);
        Invisiblewall invisiblewall50 = new Invisiblewall();
        world.addObject(invisiblewall50, 421, 3);
        Invisiblewall invisiblewall51 = new Invisiblewall();
        world.addObject(invisiblewall51, 369, 5);
        Invisiblewall invisiblewall52 = new Invisiblewall();
        world.addObject(invisiblewall52, 326, 5);
        Invisiblewall invisiblewall53 = new Invisiblewall();
        world.addObject(invisiblewall53, 273, 7);
        Invisiblewall invisiblewall54 = new Invisiblewall();
        world.addObject(invisiblewall54, 221, 3);
        Invisiblewall invisiblewall55 = new Invisiblewall();
        world.addObject(invisiblewall55, 166, 7);
        Invisiblewall invisiblewall56 = new Invisiblewall();
        world.addObject(invisiblewall56, 119, 3);
        Invisiblewall invisiblewall57 = new Invisiblewall();
        world.addObject(invisiblewall57, 73, 3);
        invisiblewall57.setLocation(80, 2);
        
       
    }
    
    public void checkLevel()
    {
        {
        if ( ( this.player.getY() >= 66 && this.player.getY() <= 129 ) && this.player.getX() >= 684)
        {
            this.world.removeObjects(this.world.getObjects(MapSix.class));
            this.world.cleanWorld();
            this.world.changeMap( 6 );
        }
    }
    }
}
