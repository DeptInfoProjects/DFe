package de;

public enum Type {
    NORMAL{
        @Override
        public String toString() {
            return "NORMAL";
        }

    },
    PLUS{
        @Override
        public String toString(){
            return "PLUS";
        }
    },
    CHOIX{
        @Override
        public String toString(){
            return "CHOIX";
        }
    };

    public abstract String toString();
}
