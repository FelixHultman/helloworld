public class Player {
        private int score;
        private String name;

        Player(String name, int score) {
            if(score < 0 )
                throw new IllegalArgumentException();
            this.name = name;
            this.score = score;
        }

        Player() {
            this.score = 0;
            this.name = "";
        }

        int getScore() {

            return score;
        }

         public void setScore(int score) {
            if (score < 0 )
                throw new IllegalArgumentException();
            this.score = score;
         }
         void increaseScore() {

            score += 1;
         }

         public String getName() {

            return name;
         }
     }
