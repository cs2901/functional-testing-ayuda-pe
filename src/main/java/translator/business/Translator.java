package translator.business;

import translator.entities.Language;

import java.io.IOException;

public interface Translator {

    public String translate(Language from, Language to, String text) throws IOException;
}
