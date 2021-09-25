package org.example.ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void print() {
        String[] test;
        test = App.print(12);
        assertEquals("    1    2    3    4    5    6    7    8    9   10   11   12", test[1]);
        assertEquals("    2    4    6    8   10   12   14   16   18   20   22   24", test[2]);
        assertEquals("    3    6    9   12   15   18   21   24   27   30   33   36", test[3]);
        assertEquals("    4    8   12   16   20   24   28   32   36   40   44   48", test[4]);
        assertEquals("    5   10   15   20   25   30   35   40   45   50   55   60", test[5]);
        assertEquals("    6   12   18   24   30   36   42   48   54   60   66   72", test[6]);
        assertEquals("    7   14   21   28   35   42   49   56   63   70   77   84", test[7]);
        assertEquals("    8   16   24   32   40   48   56   64   72   80   88   96", test[8]);
        assertEquals("    9   18   27   36   45   54   63   72   81   90   99  108", test[9]);
        assertEquals("   10   20   30   40   50   60   70   80   90  100  110  120", test[10]);
        assertEquals("   11   22   33   44   55   66   77   88   99  110  121  132", test[11]);
        assertEquals("   12   24   36   48   60   72   84   96  108  120  132  144", test[12]);
    }
}