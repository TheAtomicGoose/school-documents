/**
 * This class holds a 10px by 10px black and white bitmap image. White pixels
 * are represented by "-" and black pixels are represented by "*".
 *
 * Written as an assignment for AmplifyMOOC on 04-06-15 by Jesse Evers.
 */

public class Bitmap {

    private String image[][] = new String[10][10];

    public Bitmap(int a[]) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = "-";
            }
        }

        boolean belowTen = true;
        for (int i = 0; i < a.length; i++) {
            if (!(a[i] < 10)) {
                belowTen = false;
            }
        }

        if (a.length % 2 == 0 && belowTen) {
            for (int i = 0; i < a.length; i += 2) {
                image[a[i]][a[i+1]] = "*";
            }
        }
    }

    public void flipHorizontal() {
        for (int i = 0; i < image.length; i++) {
            String temp[] = new String[10];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = image[i][image[i].length - j - 1];
            }

            // for (int j = 0; j < temp.length; j++) {
            //     System.out.print(temp[j] + " ");
            // }
            // System.out.println();

            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = temp[j];
            }
        }
    }

    public void flipVertical() {
        for (int i = 0; i < image.length; i++) {
            String temp[] = new String[10];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = image[image.length - j - 1][i];
            }

            // for (int j = 0; j < temp.length; j++) {
            //     System.out.print(temp[j] + " ");
            // }
            // System.out.println();

            for (int j = 0; j < image[0].length; j++) {
                image[j][i] = temp[j];
            }
        }
    }

    public void reverse() {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j].equals("-")) {
                    image[i][j] = "*";
                } else {
                    image[i][j] = "-";
                }
            }
        }
    }

    public String toString() {
        String printImage = "";
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                printImage += (image[i][j]);
            }
            printImage += "\n";
        }
        return printImage;
    }
}
