/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class MapTwo extends Map 
{
    private Worlds world;

    /**
     * Constructor for objects of class MapOne
     */
    public MapTwo( Worlds world )
    {
        this.world = world;
    }

    public void makeWorld()
    {
        world.setBackground("map2.png");
        world.addObject(this.gui, 350, 350);

        this.player.setLocation(33,80);
        this.player.addedToWorld( world );

        
        
        prepare();
    }
    
    public void prepare()
    {
        
         EnemyZombie enemyzombie = new EnemyZombie();
        world.addObject(enemyzombie, 597, 189);
        enemyzombie.setLocation(599, 82);
        EnemyZombie enemyzombie2 = new EnemyZombie();
        world.addObject(enemyzombie2, 655, 649);
        EnemyZombie enemyzombie3 = new EnemyZombie();
        world.addObject(enemyzombie3, 478, 666);
        EnemyZombie enemyzombie4 = new EnemyZombie();
        world.addObject(enemyzombie4, 67, 378);
        EnemyZombie enemyzombie5 = new EnemyZombie();
        world.addObject(enemyzombie5, 583, 202);
        EnemyZombie enemyzombie6 = new EnemyZombie();
        world.addObject(enemyzombie6, 83, 629);
        EnemyZombie enemyzombie7 = new EnemyZombie();
        world.addObject(enemyzombie7, 345, 569);
        EnemyZombie enemyzombie8 = new EnemyZombie();
        world.addObject(enemyzombie8, 596, 333);
        EnemyZombie enemyzombie9 = new EnemyZombie();
        world.addObject(enemyzombie9, 461, 257);
        EnemyZombie enemyzombie10 = new EnemyZombie();
        world.addObject(enemyzombie10, 367, 467);
        EnemyZombie enemyzombie11 = new EnemyZombie();
        world.addObject(enemyzombie11, 232, 459);
        
        Invisiblewall invisiblewall = new Invisiblewall();
        world.addObject(invisiblewall, 221, 225);
        Invisiblewall invisiblewall2 = new Invisiblewall();
        world.addObject(invisiblewall2, 293, 229);
        invisiblewall2.setLocation(289, 222);
        invisiblewall.setLocation(220, 218);
        invisiblewall2.setLocation(288, 218);
        Invisiblewall invisiblewall3 = new Invisiblewall();
        world.addObject(invisiblewall3, 260, 223);
        invisiblewall3.setLocation(256, 218);
        Invisiblewall invisiblewall4 = new Invisiblewall();
        world.addObject(invisiblewall4, 226, 279);
        invisiblewall4.setLocation(220, 277);
        Invisiblewall invisiblewall5 = new Invisiblewall();
        world.addObject(invisiblewall5, 295, 283);
        invisiblewall5.setLocation(288, 275);
        Invisiblewall invisiblewall6 = new Invisiblewall();
        world.addObject(invisiblewall6, 295, 343);
        invisiblewall6.setLocation(289, 334);
        Invisiblewall invisiblewall7 = new Invisiblewall();
        world.addObject(invisiblewall7, 227, 343);
        invisiblewall7.setLocation(220, 336);
        Invisiblewall invisiblewall8 = new Invisiblewall();
        world.addObject(invisiblewall8, 257, 341);
        invisiblewall8.setLocation(255, 335);
        invisiblewall8.setLocation(253, 335);
        invisiblewall7.setLocation(220, 335);
        invisiblewall6.setLocation(289, 335);
        invisiblewall5.setLocation(289, 275);
        invisiblewall5.setLocation(289, 276);
        invisiblewall4.setLocation(220, 275);
        Invisiblewall invisiblewall9 = new Invisiblewall();
        world.addObject(invisiblewall9, 107, 308);
        invisiblewall9.setLocation(100, 304);
        Invisiblewall invisiblewall10 = new Invisiblewall();
        world.addObject(invisiblewall10, 105, 253);
        invisiblewall10.setLocation(100, 249);
        Invisiblewall invisiblewall11 = new Invisiblewall();
        world.addObject(invisiblewall11, 104, 220);
        invisiblewall11.setLocation(100, 223);
        Invisiblewall invisiblewall12 = new Invisiblewall();
        world.addObject(invisiblewall12, 432, 97);
        invisiblewall12.setLocation(430, 98);
        Invisiblewall invisiblewall13 = new Invisiblewall();
        world.addObject(invisiblewall13, 438, 150);
        invisiblewall13.setLocation(430, 136);
        invisiblewall12.setLocation(430, 76);
        Invisiblewall invisiblewall14 = new Invisiblewall();
        world.addObject(invisiblewall14, 435, 27);
        invisiblewall14.setLocation(430, 21);
        invisiblewall13.setLocation(430, 134);
        Invisiblewall invisiblewall15 = new Invisiblewall();
        world.addObject(invisiblewall15, 449, 161);
        invisiblewall15.setLocation(443, 152);
        Invisiblewall invisiblewall16 = new Invisiblewall();
        world.addObject(invisiblewall16, 466, 182);
        invisiblewall16.setLocation(459, 176);
        Invisiblewall invisiblewall17 = new Invisiblewall();
        world.addObject(invisiblewall17, 501, 181);
        invisiblewall17.setLocation(495, 176);
        Invisiblewall invisiblewall18 = new Invisiblewall();
        world.addObject(invisiblewall18, 521, 165);
        invisiblewall18.setLocation(532, 122);
        Invisiblewall invisiblewall19 = new Invisiblewall();
        world.addObject(invisiblewall19, 523, 151);
        invisiblewall19.setLocation(516, 146);
        Invisiblewall invisiblewall20 = new Invisiblewall();
        world.addObject(invisiblewall20, 538, 67);
        invisiblewall20.setLocation(532, 64);
        Invisiblewall invisiblewall21 = new Invisiblewall();
        world.addObject(invisiblewall21, 535, 6);
        invisiblewall21.setLocation(532, 6);
        Invisiblewall invisiblewall22 = new Invisiblewall();
        world.addObject(invisiblewall22, 596, 9);
        invisiblewall22.setLocation(592, 2);
        invisiblewall22.setLocation(592, 3);
        invisiblewall22.setLocation(591, 5);
        Invisiblewall invisiblewall23 = new Invisiblewall();
        world.addObject(invisiblewall23, 658, 13);
        invisiblewall23.setLocation(651, 6);
        invisiblewall23.setLocation(651, 5);
        Invisiblewall invisiblewall24 = new Invisiblewall();
        world.addObject(invisiblewall24, 677, 10);
        invisiblewall24.setLocation(677, 10);
        invisiblewall24.setLocation(677, 10);
        invisiblewall24.setLocation(677, 10);
        invisiblewall24.setLocation(677, 10);
        invisiblewall24.setLocation(674, 3);
        invisiblewall24.setLocation(675, 4);
        invisiblewall24.setLocation(676, 5);
        invisiblewall23.setLocation(632, 5);
        invisiblewall24.setLocation(686, 5);
        Tree tree = new Tree();
        world.addObject(tree, 699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(699, 118);
        tree.setLocation(696, 108);
        Tree tree2 = new Tree();
        world.addObject(tree2, 322, 161);
        tree2.setLocation(318, 152);
        Tree tree3 = new Tree();
        world.addObject(tree3, 676, 558);
        tree3.setLocation(669, 557);
        tree3.setLocation(698, 559);
        tree3.setLocation(664, 550);
        Tree tree4 = new Tree();
        world.addObject(tree4, 691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(691, 380);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        tree4.setLocation(696, 368);
        Tree tree5 = new Tree();
        world.addObject(tree5, 314, 675);
        tree5.setLocation(314, 671);
        Invisiblewall invisiblewall25 = new Invisiblewall();
        world.addObject(invisiblewall25, 496, 584);
        invisiblewall25.setLocation(490, 577);
        Invisiblewall invisiblewall26 = new Invisiblewall();
        world.addObject(invisiblewall26, 494, 614);
        invisiblewall26.setLocation(490, 607);
        Invisiblewall invisiblewall27 = new Invisiblewall();
        world.addObject(invisiblewall27, 548, 582);
        invisiblewall27.setLocation(541, 575);
        Invisiblewall invisiblewall28 = new Invisiblewall();
        world.addObject(invisiblewall28, 547, 607);
        invisiblewall28.setLocation(542, 606);
        Invisiblewall invisiblewall29 = new Invisiblewall();
        world.addObject(invisiblewall29, 467, 410);
        invisiblewall29.setLocation(460, 401);
        Invisiblewall invisiblewall30 = new Invisiblewall();
        world.addObject(invisiblewall30, 470, 434);
        invisiblewall30.setLocation(461, 434);
        Invisiblewall invisiblewall31 = new Invisiblewall();
        world.addObject(invisiblewall31, 538, 409);
        invisiblewall31.setLocation(534, 402);
        Invisiblewall invisiblewall32 = new Invisiblewall();
        world.addObject(invisiblewall32, 499, 408);
        invisiblewall32.setLocation(497, 401);
        invisiblewall31.setLocation(536, 401);
        invisiblewall29.setLocation(461, 401);
        invisiblewall30.setLocation(461, 433);
        Invisiblewall invisiblewall33 = new Invisiblewall();
        world.addObject(invisiblewall33, 520, 437);
        invisiblewall33.setLocation(516, 435);
        invisiblewall33.setLocation(521, 433);
        Invisiblewall invisiblewall34 = new Invisiblewall();
        world.addObject(invisiblewall34, 542, 437);
        invisiblewall34.setLocation(536, 433);
        invisiblewall33.setLocation(503, 433);
        Invisiblewall invisiblewall35 = new Invisiblewall();
        world.addObject(invisiblewall35, 18, 612);
        invisiblewall35.setLocation(17, 607);
        Invisiblewall invisiblewall36 = new Invisiblewall();
        world.addObject(invisiblewall36, 14, 546);
        invisiblewall36.setLocation(17, 548);
        Invisiblewall invisiblewall37 = new Invisiblewall();
        world.addObject(invisiblewall37, 21, 493);
        invisiblewall37.setLocation(17, 492);
        Invisiblewall invisiblewall38 = new Invisiblewall();
        world.addObject(invisiblewall38, 18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(18, 286);
        invisiblewall38.setLocation(7, 284);
        invisiblewall38.setLocation(9, 283);
        invisiblewall37.setLocation(12, 346);
        invisiblewall37.setLocation(11, 343);
        Invisiblewall invisiblewall39 = new Invisiblewall();
        world.addObject(invisiblewall39, 17, 410);
        invisiblewall39.setLocation(13, 401);
        Invisiblewall invisiblewall40 = new Invisiblewall();
        world.addObject(invisiblewall40, 34, 459);
        invisiblewall40.setLocation(34, 461);
        Invisiblewall invisiblewall41 = new Invisiblewall();
        world.addObject(invisiblewall41, 31, 504);
        invisiblewall41.setLocation(34, 497);
        Invisiblewall invisiblewall42 = new Invisiblewall();
        world.addObject(invisiblewall42, 692, 446);
        invisiblewall42.setLocation(690, 449);
        Invisiblewall invisiblewall43 = new Invisiblewall();
        world.addObject(invisiblewall43, 32, 502);
        invisiblewall43.setLocation(28, 501);
    }
    
    public void checkLevel()
    {
        List vijand = world.getObjects(Enemy.class);
        if ( ( this.player.getX() >= 170 && this.player.getX() <= 219 && this.player.getY() >= 681 ) && vijand.isEmpty() )
        {
            this.world.removeObjects(this.world.getObjects(MapTwo.class));
            this.world.cleanWorld();
            this.world.changeMap( 2 );
        }
    }
}
