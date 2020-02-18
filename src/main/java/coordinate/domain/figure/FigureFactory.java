package coordinate.domain.figure;

import coordinate.domain.Point;

import java.util.List;

public enum FigureFactory {
    LINE(2, new LineCreator()),
    TRIANGLE(3,new TriangleCreator()),
    RECTANGLE(4,new RectangleCreator());

    private final int pointSize;
    private final FigureCreator figureCreator;

    private FigureFactory(int pointSize, FigureCreator figureCreator) {
        this.pointSize = pointSize;
        this.figureCreator = figureCreator;
    }

    public static Figure getFigure(List<Point> points) throws InvalidFigureException{
        for(FigureFactory figure : FigureFactory.values()){
            if(figure.pointSize == points.size()){
                return figure.figureCreator.create(points);
            }
        }
        throw new InvalidFigureException("유효하지 않은 도형입니다.");
    }
}

class LineCreator implements FigureCreator {
    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}

class TriangleCreator implements FigureCreator {
    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);
    }
}

class RectangleCreator implements FigureCreator {
    @Override
    public Figure create(List<Point> points) {
        return new Rectangle(points);
    }
}