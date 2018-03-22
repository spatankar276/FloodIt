import java.util.List;
import java.util.Map;

public class Flood {
    public static void flood(WaterColor color, List<Coord> flooded_list, Map<Coord, Tile> tiles, Integer board_size) {

        for (int i = 0; i != flooded_list.size(); ++i) {
            Coord apple = flooded_list.get(i);

            for (Coord orange : apple.neighbors(board_size)) {
                if (!flooded_list.contains(orange) && tiles.get(orange).getColor() == color) {
                    flooded_list.add(orange);
                }


            }
        }
    }
}


