package complex_task.task4;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {
    private final Map<Movie, List<Rating<?>>> storage = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<? extends Number> rating) {
        double val = rating.getNumber().doubleValue();

        if (val < 1.0 || val > 10.0) {
            throw new InvalidRatingException("Оценка должна быть в диапазоне от 1 до 10");
        }

        if (!storage.containsKey(movie)) {
            storage.put(movie, new ArrayList<>());
        }

        storage.get(movie).add(rating);
    }

    public double calcAvgRating(Movie movie) {
        List<Rating<? extends Number>> list = storage.get(movie);

        if (list == null || list.isEmpty()) {
            return 0.0;
        }

        return list.stream()
                .mapToDouble(rating -> rating.getNumber().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> sortedMovieByRating() {
        return storage.keySet().stream()
                .sorted((m1, m2) -> Double.compare(calcAvgRating(m2), (calcAvgRating(m1))))
                .collect(Collectors.toList());
    }

    public Map<Movie, List<Rating<?>>> getAll() {
        return storage;
    }
}
