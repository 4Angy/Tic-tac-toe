public class win {
    public static boolean verfWin(char[][] tateti, char player){

    //verificación direccion Y
    for (int i = 0; i<3 ;i++) {
        if (tateti[i][0] == player && tateti[i][1] == player && tateti[i][2] == player ) {
            return true;
            }
        }

    //verificación direccion X
    for (int j = 0; j < 3 ; j++) {
        if (tateti[j][0] == player && tateti[j][1] == player && tateti[j][2] == player ) {
            return true;
        }

    //verificacion direccion Z

        if (tateti [0][0] == player && tateti [1][1] == player && tateti[2][2] == player)
        {
            return true;
        }
        if (tateti [0][2] == player && tateti [1][1] == player && tateti[2][1] == player)
        {
            return true;
        }

            }
        return false;
        }
    }