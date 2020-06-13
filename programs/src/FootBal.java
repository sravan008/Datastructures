import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FootBal {

    private static double minHeight = 5.8;
    private static int maxBMI = 23;
    private static int minGoalsScored = 50;
    private static int minGolasDefended = 30;

    enum Group {
        Strikers, Defenders, Re;
    }


    static List<List<String>> getSelectionStatus(List<List<String>> applications) {

        Map<String, Integer> defenderMap = new HashMap<>();
        Map<String, Integer> strikeMap = new HashMap<>();
        Map<String, String> rejectedMap = new HashMap<>();

        for (int i = 0; i < applications.size(); i++) {
            if (applicationValidator(applications.get(i))) {
                if (defenderMap.size() == 0) {
                    String playerName = (String) applications.get(i).get(i);
                    int defendGoals = Integer.parseInt(applications.get(i).get(4));
                    defenderMap.put(playerName, defendGoals);
                } else {
                    Map.Entry<String, Integer> checkMap = defenderMap.entrySet().iterator().next();
                    int defenderValue = checkMap.getValue();
                    if (defenderValue < Integer.parseInt(applications.get(i).get(4))) {
                        defenderMap.clear();
                        String playerName = (String) applications.get(i).get(0);
                        int defendGoals = Integer.parseInt(applications.get(i).get(4));
                        defenderMap.put(playerName, defendGoals);
                    }

                }
                if (!(applications.get(i).get(i).equals(defenderMap.entrySet().iterator().next().getKey()))) {
                    if (!strikeMap.containsKey((String) applications.get(i).get(0)) || defenderMap.containsKey((String) applications.get(i).get(0)))
                        rejectedMap.put((String) applications.get(i).get(0), "");
                }
                if (strikeMap.size() == 0) {
                    String playerName = (String) applications.get(i).get(i);
                    int defendGoals = Integer.parseInt(applications.get(i).get(3));
                    strikeMap.put(playerName, defendGoals);
                } else {
                    Map.Entry<String, Integer> checkMap1 = strikeMap.entrySet().iterator().next();
                    int defenderVal = checkMap1.getValue();
                    if (defenderVal < Integer.parseInt(applications.get(i).get(3))) {
                        strikeMap.clear();
                        String playerName = (String) applications.get(i).get(0);
                        int defendGoals = Integer.parseInt(applications.get(i).get(3));
                        strikeMap.put(playerName, defendGoals);
                    }
                }
                if (!(applications.get(i).get(i).equals(strikeMap.entrySet().iterator().next().getKey()))) {
                    if (!strikeMap.containsKey((String) applications.get(i).get(0)) || defenderMap.containsKey((String) applications.get(i).get(0)))
                        rejectedMap.put((String) applications.get(i).get(0), "");
                }
            }
        }

        List<List<String>> finalSelection = new ArrayList<>();
        List<String> strikersList = new ArrayList<>();
        Map.Entry<String, Integer> strikeMaps = strikeMap.entrySet().iterator().next();
        strikersList.add(strikeMaps.getKey());
        strikersList.add("SELECT");
        strikersList.add("STRIKER");
        finalSelection.add(strikersList);
        Map.Entry<String, Integer> defenderMaps = defenderMap.entrySet().iterator().next();
        List<String> defenders = new ArrayList<>();
        defenders.add(defenderMaps.getKey());
        defenders.add("SELECT");
        defenders.add("DEFENDER");
        finalSelection.add(defenders);
        Map.Entry<String, String> rejectedMaps = rejectedMap.entrySet().iterator().next();
        rejectedMap.remove(strikeMap.entrySet().iterator().next().getKey());
        rejectedMap.remove(defenderMap.entrySet().iterator().next().getKey());
        List<String> rejxPlayers = new ArrayList<>();

        for (Map.Entry<String, String> entry : rejectedMap.entrySet()) {
            List<String> rejecectedPlayes = new ArrayList<>();
            rejecectedPlayes.add(entry.getKey());
            rejecectedPlayes.add("REJECT");
            rejecectedPlayes.add("NA");
            rejxPlayers.addAll(rejecectedPlayes);
        }
        finalSelection.add(rejxPlayers);
        return finalSelection;
    }


    public static Boolean applicationValidator(List<String> application) {
        if (Double.parseDouble(application.get(1)) >= minHeight) {
            if (Integer.parseInt(application.get(2)) <= maxBMI) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        List<List<String>> dataList = new ArrayList<>();
        List<String> player1 = new ArrayList<>();
        player1.add("Boateng ");
        player1.add("6.1");
        player1.add("22");
        player1.add("24");
        player1.add("45");
        dataList.add(player1);
        List<String> player2 = new ArrayList<>();
        player2.add("Kaka");
        player2.add("6");
        player2.add("22");
        player2.add("1");
        player2.add("1");
        dataList.add(player2);
        List<String> player3 = new ArrayList<>();
        player3.add("Ronaldo");
        player3.add("5.8");
        player3.add("21");
        player3.add("120");
        player3.add("0");
        dataList.add(player3);
        List<String> player4 = new ArrayList<>();
        player4.add("Saurez");
        player4.add("5.9");
        player4.add("20");
        player4.add("100");
        player4.add("1");
        dataList.add(player4);

        List<List<String>> finalPlayersList = FootBal.getSelectionStatus(dataList);

    }


}
