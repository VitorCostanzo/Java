package app;

import frames.IntroFrame;
import instrumentos.Instrumentos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Instrumentos> instrumento = new ArrayList<>();
    public static void main(String[] args){
        frames.IntroFrame.openFrame();
    }
}