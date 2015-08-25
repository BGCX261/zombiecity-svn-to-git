/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapSeven extends Map 
{
    private Worlds world;
    private boolean isFilled = false;
    /**
     * Constructor for objects of class MapOne
     */
    public MapSeven( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map7.png");
        world.addObject(this.gui, 350, 350);

        this.player.setLocation(33,80);
        this.player.addedToWorld( world );
        
        prepare();
    }
    
    public void prepare()
    {
        EnemyLikeABoss enemylikeaboss = new EnemyLikeABoss();
        world.addObject(enemylikeaboss, 585, 359);
        
        EnemyZombie enemyzombie = new EnemyZombie();
        world.addObject(enemyzombie, 581, 310);
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 646, 621);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 477, 645);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 121, 649);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 416, 423);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 363, 547);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 209, 441);
        EnemyZombie enemyzombie8 = new EnemyZombie();
        world.addObject(enemyzombie8, 52, 505);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 221, 553);
        EnemyZombie enemyzombie10 = new EnemyZombie();
        world.addObject(enemyzombie10, 669, 321);
        EnemyZombie enemyzombie11 = new EnemyZombie();
        world.addObject(enemyzombie11, 611, 428);
        enemyzombie11.setLocation(596, 398);
        Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 637, 376);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 496, 290);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 416, 335);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 459, 290);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 292, 265);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 285, 318);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 415, 482);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 408, 494);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 316, 503);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 279, 524);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 332, 534);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 158, 516);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 419, 524);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 127, 481);
        Invisiblewall invisiblewall15 = new Invisiblewall();
        world.addObject(invisiblewall15, 158, 427);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 340, 383);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 379, 255);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 377, 279);
        Invisiblewall invisiblewall19 = new Invisiblewall();
        world.addObject(invisiblewall19, 292, 231);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 443, 279);
        Invisiblewall invisiblewall21 = new Invisiblewall();
        world.addObject(invisiblewall21, 272, 364);
        Invisiblewall invisiblewall22 = new Invisiblewall();
        world.addObject(invisiblewall22, 536, 468);
        Invisiblewall invisiblewall23 = new Invisiblewall();
        world.addObject(invisiblewall23, 373, 523);
        invisiblewall19.setLocation(582, 23);
        invisiblewall4.setLocation(532, 85);
        invisiblewall17.setLocation(576, 69);
        invisiblewall2.setLocation(485, 82);
        invisiblewall20.setLocation(447, 86);
        invisiblewall3.setLocation(446, 29);
        invisiblewall.setLocation(505, 223);
        invisiblewall22.setLocation(489, 172);
        invisiblewall16.setLocation(302, 16);
        invisiblewall18.setLocation(267, 19);
        invisiblewall16.setLocation(267, 66);
        invisiblewall5.setLocation(267, 115);
        invisiblewall6.setLocation(266, 165);
        invisiblewall18.setLocation(267, 6);
        invisiblewall16.setLocation(267, 58);
        invisiblewall6.setLocation(267, 160);
        invisiblewall21.setLocation(268, 214);
        invisiblewall15.setLocation(268, 265);
        invisiblewall14.setLocation(268, 316);
        invisiblewall12.setLocation(268, 366);
        invisiblewall10.setLocation(268, 420);
        invisiblewall9.setLocation(268, 473);
        invisiblewall11.setLocation(326, 473);
        invisiblewall23.setLocation(326, 419);
        invisiblewall8.setLocation(367, 363);
        invisiblewall7.setLocation(420, 364);
        invisiblewall13.setLocation(472, 367);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 597, 522);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 595, 522);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 603, 433);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 643, 370);
        Invisiblewall invisiblewall28 = new Invisiblewall();
        world.addObject(invisiblewall28, 647, 309);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 626, 254);
        invisiblewall29.setLocation(504, 247);
        invisiblewall28.setLocation(494, 289);
        invisiblewall27.setLocation(474, 324);
        invisiblewall28.setLocation(499, 298);
        invisiblewall27.setLocation(483, 328);
        invisiblewall26.setLocation(487, 155);
        invisiblewall25.setLocation(430, 155);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 584, 300);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 574, 443);
        Invisiblewall invisiblewall32 = new Invisiblewall();
        world.addObject(invisiblewall32, 595, 373);
        invisiblewall30.setLocation(377, 155);
        invisiblewall32.setLocation(320, 156);
        invisiblewall31.setLocation(304, 104);
        invisiblewall24.setLocation(304, 48);
        Invisiblewall invisiblewall33 = new Invisiblewall();
        world.addObject(invisiblewall33, 312, 23);
        Invisiblewall invisiblewall34 = new Invisiblewall();
        Invisiblewall invisiblewall35 = new Invisiblewall();
        world.addObject(invisiblewall35, 455, 696);
        Invisiblewall invisiblewall36 = new Invisiblewall();
        world.addObject(invisiblewall36, 522, 696);
        invisiblewall36.setLocation(522, 696);
        invisiblewall36.setLocation(512, 697);
        Invisiblewall invisiblewall37 = new Invisiblewall();
        world.addObject(invisiblewall37, 579, 699);
        invisiblewall37.setLocation(569, 695);
        Invisiblewall invisiblewall38 = new Invisiblewall();
        world.addObject(invisiblewall38, 636, 698);
        invisiblewall38.setLocation(626, 699);
        Invisiblewall invisiblewall39 = new Invisiblewall();
        world.addObject(invisiblewall39, 685, 696);
        invisiblewall39.setLocation(683, 698);
        Invisiblewall invisiblewall40 = new Invisiblewall();
        world.addObject(invisiblewall40, 71, 693);
        invisiblewall40.setLocation(66, 693);
        invisiblewall40.setLocation(63, 693);
        Invisiblewall invisiblewall41 = new Invisiblewall();
        world.addObject(invisiblewall41, 127, 697);
        invisiblewall41.setLocation(122, 694);
        Invisiblewall invisiblewall42 = new Invisiblewall();
        world.addObject(invisiblewall42, 186, 696);
        invisiblewall42.setLocation(182, 695);
        Invisiblewall invisiblewall43 = new Invisiblewall();
        world.addObject(invisiblewall43, 245, 693);
        invisiblewall42.setLocation(178, 694);
        invisiblewall43.setLocation(234, 693);
        Invisiblewall invisiblewall44 = new Invisiblewall();
        world.addObject(invisiblewall44, 278, 684);
        invisiblewall44.setLocation(269, 691);
        Invisiblewall invisiblewall45 = new Invisiblewall();
        world.addObject(invisiblewall45, 33, 10);
        invisiblewall45.setLocation(26, 10);
        Invisiblewall invisiblewall46 = new Invisiblewall();
        world.addObject(invisiblewall46, 74, 10);
        Invisiblewall invisiblewall47 = new Invisiblewall();
        world.addObject(invisiblewall47, 122, 12);
        Invisiblewall invisiblewall48 = new Invisiblewall();
        world.addObject(invisiblewall48, 169, 11);
        Invisiblewall invisiblewall49 = new Invisiblewall();
        world.addObject(invisiblewall49, 224, 9);
        Tree tree = new Tree();
        world.addObject(tree, 193, 191);
        Tree tree2 = new Tree();
        world.addObject(tree2, 570, 482);
        Tree tree3 = new Tree();
        world.addObject(tree3, 47, 617);
        
    }
    
    public void checkLevel()
    {
        List vijand = world.getObjects( Enemy.class );
        if(!this.isFilled && vijand.isEmpty())
        {
            this.player.isAlive = false;
            
            TextTrigger textTrigger4 = new TextTrigger("Mission succesful completed!",35);
            world.addObject(textTrigger4, 612, 207);
            this.isFilled = true;
        }
    }
}
