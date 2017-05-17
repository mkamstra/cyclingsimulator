package nl.martijnkamstra.cyclingsimulator.model.rider;

public class RiderAttributes {
    // Trainable attributes
    private double climb;
    private double downhill;
    private double sprint;
    private double timetrial;
    private double cobbles;
    private double flatroad;

    // Changeable attributes
    private double experience; // Built up during racing

    // Unchangeable attributes, given at 'birth'
    private double recovery;
    private double explosiveness;
    private double agressiveness; // Riding offensive (can create opportunities but also waste energy)
    private double fightingspirit; // Like Jens Voigt who never gave up, but works only in favourable races
    private double tacticalinsight; // Ability to read a race
    private double leader;
    private double helper; // Might seem like complement of leader, but not all riders who are not leaders are good helpers (more individualists)

    /**
     * Name          CL  DH  SP  TT  CB  FR    RC  EXP   AG   FS   TI   LS   HP
     * Froome        95  80  60  90  40  70    95   60   70   70   60   90   50
     * Dumoulin      80  80  70  95  50  75    85   60   50   60   75   80   70
     * Boonen        40  85  90  60  95  80    40   95   85   80   85   85   60
     * Van Avermaet  60  85  80  60  80  85    60   85   95   80   75   90   60
     * Sagan         60  95  92  65  80  85    60   95   95   90   80   95   60
     * Contador      95  90  70  85  40  65    95   70   90   90   75   95   50
     * Gesink        85  70  50  65  40  60    75   40   70   60   70   60   60
     * Nibali        85  95  60  80  75  70    90   65   90   70   90   95   50
     */

    /**
     * Race          CL  DH  SP  TT  CB  RF  REC  EXP  AGR  FIG
     * Tour (class)  10   8   1   8   2   8   10    4    4    4
     * Vlaanderen     3   3   7   1   7   9    3   10    8    6
     * P-R            1   1   8   1  10  10    1    9    9    8
     * LBL            7   6   3   1   1   6    4    8    6    6
     * AGR            5   6   5   1   2   7    3   10    8    6
     * Romandie       8   6   2   7   2   6    8    5    4    4
     * Parijs-Nice    7   7   5   6   2   8    7    7    7    5
     * Denemarken     2   1   7   8   3  10    5    8    8    7
     * Eneco Tour     3   2   8   8   5  10    5    8    8    7
     */
}
