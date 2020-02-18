package coordinate.domain.figure;

import coordinate.domain.Point;
import coordinate.domain.figure.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class FigureFactoryTest {
    @Test
    public void line() {
        List<Point> points = Arrays.asList(
                Point.of(1, 2),
                Point.of(2, 3));

        try {
            Figure figure = FigureFactory.getFigure(points);
            assertThat(figure).isInstanceOfAny(Line.class);
            assertThat(figure.getName()).isEqualTo("선");
        }catch(InvalidFigureException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void triangle() {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4));

        try {
            Figure figure = FigureFactory.getFigure(points);
            assertThat(figure).isInstanceOfAny(Triangle.class);
            assertThat(figure.getName()).isEqualTo("삼각형");
        }catch(InvalidFigureException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void rectangle() {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4),
                Point.of(4, 4));

        try {
            Figure figure = FigureFactory.getFigure(points);
            assertThat(figure).isInstanceOfAny(Rectangle.class);
            assertThat(figure.getName()).isEqualTo("사각형");
        }catch(InvalidFigureException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void invalid_figure() {
        List<Point> points = Arrays.asList(Point.of(1, 2));
        Assertions.assertThatThrownBy(()->{
            FigureFactory.getFigure(points);
        }).isInstanceOf(Exception.class);
    }
}
