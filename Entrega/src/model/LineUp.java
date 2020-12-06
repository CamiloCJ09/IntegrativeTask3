package model;

public class LineUp {
    private String date;
    private int[][] formation;
    private Tactics formationTactic;

    public LineUp(String date, Tactics formationTactics) {
        this.date = date;
        this.formation = new int[10][7];
        this.formationTactic = formationTactics;
    }

    public void organizeFormation(int[] positions) {
        boolean out = false;
        int sentinel = 0;
        for (int k = formation.length - 1; k >= 0 && out != true; k--) {
            if (k % 2 == 0) {
                while (out != true && sentinel != positions.length) {
                    switch (positions[sentinel]) {
                        case 1:
                            formation[k][3] = 1;
                            out = true;
                            sentinel += 1;
                            break;

                        case 2:
                            formation[k][2] = 1;
                            formation[k][4] = 1;
                            out = true;
                            sentinel += 1;
                            break;

                        case 3:
                            formation[k][1] = 1;
                            formation[k][3] = 1;
                            formation[k][5] = 1;
                            out = true;
                            sentinel += 1;
                            break;

                        case 4:
                            formation[k][1] = 1;
                            formation[k][2] = 1;
                            formation[k][4] = 1;
                            formation[k][5] = 1;
                            out = true;
                            sentinel += 1;
                            break;
                        case 5:
                            formation[k][1] = 1;
                            formation[k][2] = 1;
                            formation[k][3] = 1;
                            formation[k][4] = 1;
                            formation[k][5] = 1;
                            out = true;
                            sentinel += 1;
                            break;
                        case 6:
                            formation[k][1] = 1;
                            formation[k][2] = 1;
                            formation[k][3] = 1;
                            formation[k][4] = 1;
                            formation[k][5] = 1;
                            formation[k][6] = 1;
                            
                            out = true;
                            sentinel += 1;
                            break;

                        case 7:
                            formation[k][1] = 1;
                            formation[k][2] = 1;
                            formation[k][3] = 1;
                            formation[k][4] = 1;
                            formation[k][5] = 1;
                            formation[k][6] = 1;
                            formation[k][0] = 1;
                            out = true;
                            sentinel += 1;
                            break;

                        

                    }
                    if (sentinel == positions.length) {
                        out = true;
                    }
                }
            }

            out = false;
        }

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int[][] getFormation() {
        return formation;
    }

    public void setFormation(int[][] formation) {
        this.formation = formation;
    }

    public Tactics getFormationTactic() {
        return formationTactic;
    }

    public void setFormationTactic(Tactics formationTactic) {
        this.formationTactic = formationTactic;
    }

    public String formationToString() {
        String msg = "";
        msg += "Date: "+date+"\n";
        msg += "Tactic: "+formationTactic+"\n";
        for(int i = 0; i < formation.length; i++){
            for(int j = 0; j < formation[0].length; j++){
                msg += formation[i][j]+"\t";
            }
            msg += "\n";
        }
        return msg;
    }
}
