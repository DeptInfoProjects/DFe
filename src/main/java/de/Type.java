package de;

public enum Type {    /* enumeration de 5 types de Face de dé */
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
    },
    X3{@Override
    public String toString(){
        return "X3";
    }
    },
    ADVER {
        @Override
        public String toString() {
            return "ADVER";
        }

    };

    public abstract String toString();
}
