import com.codeclan.example.db.DBHelper;

public class Runner {


        public static void main(String[] args) {


            Team team = new Team("Liverpool");
            DBHelper.save(Team)
            Team team2 = new Team("Chelsea");
            DBHelper.save(Team)

            Team team3 = new Team("Manchester United");
            DBHelper.save(Team)


            Competition competition = new Competition("Premier League", 80000);
            DBHelper.save(L)


            Player player1 = new Player("Steven Gerrard", 28);
            DBHelper.save(Player)

            Player player2 = new Player("Kaka", 19);
            DBHelper.save(Player)

            Player player3 = new Player("Messi", 39);
            DBHelper.save(Player)


            Manager manager = new Manager("Jurgen klopp", 45);
            DBHelper.save(Manager)






        }
    }


