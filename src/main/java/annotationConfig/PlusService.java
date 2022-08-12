package annotationConfig;

import org.springframework.stereotype.Service;

@Service("plusService")
public class PlusService {
    public int plus(int number1, int number2) {
        return number1 + number2;
    }
}
