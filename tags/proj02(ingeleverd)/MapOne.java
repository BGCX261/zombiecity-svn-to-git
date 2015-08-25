/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapOne extends Map 
{
    private Worlds world;

    /**
     * Constructor for objects of class MapOne
     */
    public MapOne( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map1.png");
        world.addObject(this.gui, 350, 350);

        //player.setLocation(423,662);
        world.addObject(this.player, 423, 662);
        this.player.addedToWorld( world );
        
        prepare();
    }
    
    public void prepare()
    {
       EnemyZombie enemyzombie = new EnemyZombie();
        world.addObject(enemyzombie, 602, 64);
        enemyzombie.setLocation(635, 60);
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 628, 197);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 508, 37);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 432, 136);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 363, 78);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 127, 77);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 105, 285);
        EnemyZombie enemyzombie8 = new EnemyZombie();
        world.addObject(enemyzombie8, 244, 82);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 282, 144);
        enemyzombie9.setLocation(199, 156);
        
        Tree tree = new Tree();
        world.addObject(tree, 279, 185);
        tree.setLocation(276, 178);
        Tree tree2 = new Tree();
        world.addObject(tree2, 79, 235);
        tree2.setLocation(76, 228);
        Tree tree3 = new Tree();
        world.addObject(tree3, 532, 141);
        tree3.setLocation(529, 134);
        Tree tree4 = new Tree();
        world.addObject(tree4, 415, 265);
        tree4.setLocation(412, 258);
        Tree tree5 = new Tree();
        world.addObject(tree5, 298, 419);
        tree5.setLocation(295, 412);
        
        Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 287, 133);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 504, 126);
        world.addObject(invisiblewall, 80, 117);
        invisiblewall.setLocation(71, 103);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 79, 124);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 105, 499);
        invisiblewall4.setLocation(97, 497);
        invisiblewall4.setLocation(96, 494);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 102, 560);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 149, 628);
        invisiblewall6.setLocation(141, 619);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 207, 625);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 288, 629);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 657, 456);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 542, 321);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 520, 433);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 519, 527);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 568, 623);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 448, 598);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 352, 358);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 352, 274);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 588, 242);
        Invisiblewall invisiblewall19 = new Invisiblewall();
        world.addObject(invisiblewall19, 452, 269);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 546, 371);
        Invisiblewall invisiblewall21 = new Invisiblewall();
        world.addObject(invisiblewall21, 580, 366);
        Invisiblewall invisiblewall22 = new Invisiblewall();
        world.addObject(invisiblewall22, 522, 404);
        Invisiblewall invisiblewall23 = new Invisiblewall();
        world.addObject(invisiblewall23, 517, 445);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 620, 502);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 592, 513);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 493, 425);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 567, 394);
        invisiblewall7.setLocation(192, 620);
        invisiblewall8.setLocation(247, 622);
        invisiblewall14.setLocation(281, 593);
        invisiblewall13.setLocation(307, 577);
        invisiblewall12.setLocation(337, 575);
        invisiblewall25.setLocation(335, 633);
        invisiblewall26.setLocation(490, 608);
        invisiblewall23.setLocation(490, 552);
        invisiblewall11.setLocation(497, 489);
        invisiblewall22.setLocation(497, 436);
        invisiblewall27.setLocation(429, 389);
        invisiblewall20.setLocation(485, 399);
        invisiblewall10.setLocation(409, 372);
        invisiblewall16.setLocation(381, 301);
        invisiblewall10.setLocation(399, 381);
        invisiblewall16.setLocation(380, 360);
        invisiblewall21.setLocation(376, 308);
        invisiblewall17.setLocation(381, 264);
        invisiblewall19.setLocation(392, 232);
        invisiblewall18.setLocation(422, 225);
        invisiblewall9.setLocation(480, 225);
        invisiblewall24.setLocation(520, 226);
        invisiblewall2.setLocation(590, 261);
        invisiblewall.setLocation(46, 354);
        invisiblewall3.setLocation(31, 298);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 25, 244);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 32, 188);
        invisiblewall30.setLocation(16, 187);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(25, 244);
        invisiblewall29.setLocation(13, 244);
        invisiblewall30.setLocation(16, 185);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 59, 163);
        Invisiblewall invisiblewall32 = new Invisiblewall();
        world.addObject(invisiblewall32, 76, 122);
        Invisiblewall invisiblewall33 = new Invisiblewall();
        world.addObject(invisiblewall33, 84, 70);
        Invisiblewall invisiblewall34 = new Invisiblewall();
        world.addObject(invisiblewall34, 85, 21);
        invisiblewall31.setLocation(57, 160);
        invisiblewall32.setLocation(71, 126);
        invisiblewall33.setLocation(82, 79);
        invisiblewall34.setLocation(85, 25);
        Invisiblewall invisiblewall35 = new Invisiblewall();
        world.addObject(invisiblewall35, 55, 415);
        invisiblewall35.setLocation(51, 410);
        Invisiblewall invisiblewall36 = new Invisiblewall();
        world.addObject(invisiblewall36, 94, 472);
        invisiblewall36.setLocation(92, 478);
        Invisiblewall invisiblewall37 = new Invisiblewall();
        world.addObject(invisiblewall37, 76, 462);
        invisiblewall37.setLocation(74, 460);
        Invisiblewall invisiblewall38 = new Invisiblewall();
        world.addObject(invisiblewall38, 310, 596);
        Invisiblewall invisiblewall39 = new Invisiblewall();
        world.addObject(invisiblewall39, 282, 614);
        invisiblewall38.setLocation(303, 590);
        invisiblewall39.setLocation(283, 605);
        invisiblewall39.setLocation(288, 605);
        invisiblewall38.setLocation(306, 593);
        Invisiblewall invisiblewall40 = new Invisiblewall();
        world.addObject(invisiblewall40, 105, 534);
        invisiblewall40.setLocation(98, 534);
        Invisiblewall invisiblewall41 = new Invisiblewall();
        world.addObject(invisiblewall41, 505, 505);
        invisiblewall41.setLocation(498, 506);
        Invisiblewall invisiblewall42 = new Invisiblewall();
        world.addObject(invisiblewall42, 540, 244);
        invisiblewall42.setLocation(541, 239);
        Invisiblewall invisiblewall43 = new Invisiblewall();
        world.addObject(invisiblewall43, 613, 270);
        Invisiblewall invisiblewall44 = new Invisiblewall();
        world.addObject(invisiblewall44, 669, 273);
        invisiblewall44.setLocation(672, 270);
        Invisiblewall invisiblewall45 = new Invisiblewall();
        world.addObject(invisiblewall45, 496, 660);
        invisiblewall45.setLocation(490, 654);
        Invisiblewall invisiblewall46 = new Invisiblewall();
        world.addObject(invisiblewall46, 331, 659);
        invisiblewall46.setLocation(335, 654);
        
        Invisiblewall invisiblewall47 = new Invisiblewall();
        world.addObject(invisiblewall47, 341, 696);
        invisiblewall47.setLocation(341, 696);
        Invisiblewall invisiblewall48 = new Invisiblewall();
        world.addObject(invisiblewall48, 496, 697);
        invisiblewall48.setLocation(490, 697);
        
        TextTrigger textTrigger = new TextTrigger("Level 1 ",35);
        world.addObject(textTrigger, 410, 625);
        
        
    }
    
    public void checkLevel()
    {
        List vijand = world.getObjects(Enemy.class);
        if ( this.player.getX() == ( world.getWidth() - 1 ) && ( this.player.getY() >= 39 && this.player.getY() <= 114 )  && vijand.isEmpty() )
        {
            this.world.removeObjects(this.world.getObjects(MapOne.class));
            this.world.cleanWorld();
            this.world.changeMap( 1 );
        }
    }
}
