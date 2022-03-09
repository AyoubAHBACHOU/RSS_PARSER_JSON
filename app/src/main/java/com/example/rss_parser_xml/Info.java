package com.example.rss_parser_xml;
import androidx.annotation.NonNull;
public class Info {
    private final String img,titre;

    public Info( String titre,String img) {
        this.img = img;
        this.titre = titre;
    }

    public String getImg() {
        return img;
    }

    public String getTitre() {
        return titre;
    }

    @NonNull
    @Override
    public String toString() {
        return "Elem{title: "+this.titre+'\''+"image: "+this.img+"}";
    }
}
