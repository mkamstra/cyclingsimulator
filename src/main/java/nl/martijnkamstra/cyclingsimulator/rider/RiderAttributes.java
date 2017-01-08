package nl.martijnkamstra.cyclingsimulator.rider;

public class RiderAttributes {
    private int climb;
    private int downhill;
    private int sprint;
    private int timetrial;
    private int cobbles;

    private int recovery;
    private int explosiveness;
    private int agressiveness; // Riding offensive (can create opportunities but also waste energy
    private int fightingspirit; // Like Jens Voigt who never gave up, but works only in favourable races
    private int leader;
    private int helper; // Might seem like complement of leader, but not all riders who are not leaders are good helpers (more individualists)

    /**
     * Name          CL  DH  SP  TT  CB    REC  EXP  AGR  FIG  LEA  HEL
     * Froome        95  80  60  90  40     95   60   70   70   90   50
     * Dumoulin      80  80  70  95  50     85   60   50   60   80   70
     * Boonen        40  85  90  60  95     40   95   85   80   85   60
     * Van Avermaet  60  85  80  60  80     60   85   95   80   90   60
     * Sagan         60  95  92  65  80     60   95   95   90   95   60
     * Contador      95  90  70  85  40     95   70   90   90   95   50
     * Gesink        85  70  50  65  40     75   40   70   60   60   60
     * Nibali        85  95  60  80  75     90   65   90   70   95   50
     */

    /**
     * Race          CL  DH  SP  TT  CB    REC  EXP  AGR  FIG
     * Tour (class)  10   8   1   8   2     10    4    4    4
     * Vlaanderen     3   3   7   1   7      3   10    8    6
     * P-R            1   1   8   1  10      1    9    9    8
     * LBL            7   6   3   1   1      4    8    6    6
     * AGR            5   6   5   1   2      3   10    8    6
     * Romandie       8   6   2   7   2      8    5    4    4
     * Parijs-Nice    7   7   5   6   2      7    7    7    5
     * Denemarken     2   1   7   8   3      5    8    8    7
     * Eneco Tour     3   2   8   8   5      5    8    8    7
     */
}
