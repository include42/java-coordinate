package coordinate;

import coordinate.domain.InvalidPointException;
import coordinate.domain.Point;
import coordinate.domain.figure.FigureFactory;
import coordinate.domain.figure.InvalidFigureException;
import coordinate.utils.PointParser;
import coordinate.view.InputView;

import java.util.List;

public class CoordinateApplication {
    public static void main(String[] args) {
        String value = InputView.getPoint();
        try {
            List<Point> points = PointParser.parse(value);
            FigureFactory.getFigure(points);
        } catch (InvalidFigureException | InvalidPointException e){
            System.out.println(e.getMessage());
        }
    }
}
