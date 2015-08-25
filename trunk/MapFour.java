/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapFour extends Map 
{
    private Worlds world;

    /**
     * Constructor for objects of class MapOne
     */
    public MapFour( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map4.png");
        world.addObject(this.gui, 350, 350);

        this.player.setLocation(680,514);
        this.player.addedToWorld( world );

        prepare();
    }
    
    public void prepare()
    {
        EnemyZombie enemyzombie = new EnemyZombie();
        world.addObject(enemyzombie, 402, 70);
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 397, 330);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 430, 487);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 508, 400);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 633, 304);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 658, 252);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 630, 179);
        EnemyZombie enemyzombie8 = new EnemyZombie();
        world.addObject(enemyzombie8, 43, 583);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 58, 644);
        EnemyZombie enemyzombie11 = new EnemyZombie();
        world.addObject(enemyzombie11, 185, 640);
        EnemyZombie enemyzombie12 = new EnemyZombie();
        world.addObject(enemyzombie12, 335, 642);
        EnemyZombie enemyzombie13 = new EnemyZombie();
        world.addObject(enemyzombie13, 461, 604);
        EnemyZombie enemyzombie14 = new EnemyZombie();
        world.addObject(enemyzombie14, 308, 359);
        EnemyZombie enemyzombie15 = new EnemyZombie();
        world.addObject(enemyzombie15, 401, 198);
        enemyzombie13.setLocation(330, 449);
        enemyzombie12.setLocation(298, 614);
        enemyzombie11.setLocation(181, 567);
        enemyzombie12.setLocation(274, 650);
        enemyzombie4.setLocation(506, 261);
        enemyzombie5.setLocation(501, 105);
        enemyzombie7.setLocation(362, 149);
        enemyzombie6.setLocation(520, 199);
        enemyzombie4.setLocation(457, 297);
        enemyzombie3.setLocation(151, 649);
        Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 540, 67);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 543, 131);
        invisiblewall.setLocation(530, 26);
        invisiblewall2.setLocation(530, 85);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 537, 138);
        invisiblewall3.setLocation(530, 127);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 576, 155);
        invisiblewall4.setLocation(576, 146);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 633, 153);
        invisiblewall5.setLocation(631, 146);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 632, 84);
        invisiblewall6.setLocation(631, 87);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 638, 30);
        invisiblewall7.setLocation(631, 34);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 681, 2);
        invisiblewall8.setLocation(681, 2);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 683, 398);
        invisiblewall9.setLocation(685, 394);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 600, 407);
        invisiblewall10.setLocation(593, 398);
        invisiblewall9.setLocation(651, 398);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 688, 405);
        invisiblewall11.setLocation(687, 398);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 698, 659);
        invisiblewall12.setLocation(697, 655);
        invisiblewall12.setLocation(696, 655);
        invisiblewall12.setLocation(696, 657);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 632, 663);
        invisiblewall13.setLocation(638, 657);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 586, 663);
        invisiblewall14.setLocation(580, 657);
        Invisiblewall invisiblewall15 = new Invisiblewall();
        world.addObject(invisiblewall15, 508, 661);
        invisiblewall15.setLocation(521, 657);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 470, 662);
        invisiblewall16.setLocation(462, 657);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 407, 662);
        invisiblewall17.setLocation(403, 657);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 378, 666);
        invisiblewall18.setLocation(372, 657);
        Invisiblewall invisiblewall19 = new Invisiblewall();
        world.addObject(invisiblewall19, 49, 506);
        invisiblewall19.setLocation(43, 499);
        invisiblewall19.setLocation(23, 498);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 95, 503);
        invisiblewall20.setLocation(80, 498);
        invisiblewall20.setLocation(81, 498);
        Invisiblewall invisiblewall21 = new Invisiblewall();
        world.addObject(invisiblewall21, 123, 501);
        invisiblewall21.setLocation(137, 498);
        Invisiblewall invisiblewall22 = new Invisiblewall();
        world.addObject(invisiblewall22, 194, 504);
        invisiblewall22.setLocation(185, 499);
        Invisiblewall invisiblewall23 = new Invisiblewall();
        world.addObject(invisiblewall23, 201, 492);
        invisiblewall23.setLocation(196, 482);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 209, 469);
        invisiblewall24.setLocation(207, 469);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 228, 462);
        invisiblewall25.setLocation(219, 454);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 234, 446);
        invisiblewall26.setLocation(228, 442);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 244, 436);
        invisiblewall27.setLocation(239, 430);
        Invisiblewall invisiblewall28 = new Invisiblewall();
        world.addObject(invisiblewall28, 253, 425);
        invisiblewall28.setLocation(248, 419);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 245, 367);
        invisiblewall29.setLocation(248, 361);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 254, 308);
        invisiblewall30.setLocation(248, 302);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 261, 294);
        invisiblewall31.setLocation(256, 287);
        Invisiblewall invisiblewall32 = new Invisiblewall();
        world.addObject(invisiblewall32, 272, 282);
        invisiblewall32.setLocation(267, 275);
        Invisiblewall invisiblewall33 = new Invisiblewall();
        world.addObject(invisiblewall33, 282, 267);
        invisiblewall33.setLocation(278, 260);
        Invisiblewall invisiblewall34 = new Invisiblewall();
        world.addObject(invisiblewall34, 295, 254);
        invisiblewall34.setLocation(288, 247);
        Invisiblewall invisiblewall35 = new Invisiblewall();
        world.addObject(invisiblewall35, 302, 244);
        Invisiblewall invisiblewall36 = new Invisiblewall();
        world.addObject(invisiblewall36, 304, 175);
        invisiblewall36.setLocation(298, 176);
        Invisiblewall invisiblewall37 = new Invisiblewall();
        world.addObject(invisiblewall37, 298, 121);
        Invisiblewall invisiblewall38 = new Invisiblewall();
        world.addObject(invisiblewall38, 305, 67);
        invisiblewall38.setLocation(298, 64);
        Invisiblewall invisiblewall39 = new Invisiblewall();
        world.addObject(invisiblewall39, 304, 12);
        invisiblewall35.setLocation(298, 235);
        invisiblewall39.setLocation(298, 11);
        Invisiblewall invisiblewall40 = new Invisiblewall();
        world.addObject(invisiblewall40, 379, 690);
        invisiblewall40.setLocation(370, 691);
        Invisiblewall invisiblewall41 = new Invisiblewall();
        world.addObject(invisiblewall41, 533, 1);
        invisiblewall41.setLocation(533, 1);
    }
    
    public void checkLevel()
    {
        if ( ( this.player.getX() >= 380 && this.player.getX() <= 466 ) && this.player.getY() <= 16 )
        {
            this.world.removeObjects(this.world.getObjects(MapFour.class));
            this.world.cleanWorld();
            this.world.changeMap( 4 );
        }
    }
}
