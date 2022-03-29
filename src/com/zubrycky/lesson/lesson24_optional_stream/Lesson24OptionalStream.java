package com.zubrycky.lesson.lesson24_optional_stream;

import java.util.Optional;

import static com.zubrycky.utils.Utils.print;

public class Lesson24OptionalStream implements Runnable {
    private final StringRepository stringRepository = new StringRepository();

    @Override
    public void run() {
/*        test2("cos tam");
        test2(null);*/
        //test1();
/*        test3("elo");
        test3(null);*/
        print(test4("123456789"));
        print(test4(null));
        print(test4(null));
        print(test4(null));
        print(test4("1234"));
    }

    private String test1() {
        Optional<String> optional = Optional.of("siema");
        String string = stringRepository.getString();
        return optional.orElse(string);
/*        if (optional.isPresent())
            return optional.get();
        else return "czesc";*/
    }

    private String test2(String string) {
        Optional<String> stringOptional = Optional.ofNullable(string);
        return stringOptional.orElseGet(stringRepository::getString);
    }

    private Integer test3(String string) {
        Optional<String> stringOptional = Optional.ofNullable(string);
        return stringOptional
                .map(String::length)
                .orElseGet(() -> stringRepository.getString().length());
    }

    private String test4(String string) {
        return Optional.ofNullable(string)
                .or(() -> Optional.ofNullable(stringRepository.getStringOrNull()))
                .filter(s -> s.length() > 7)
                .map(s -> s.substring(0, 8))
                .orElse("empty");
    }
}
