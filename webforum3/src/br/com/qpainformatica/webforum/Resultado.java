package br.com.qpainformatica.webforum;

public class Resultado {
	
    private final long id;
    public final String content;

    public Resultado(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
