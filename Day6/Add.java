class Add<D>{
    public Object Add(D a, D b){
        if(a instanceof Integer){
            return ((int)a+(int)b);
        }
        if (a instanceof Double) {
            return ((Double)a+(Double)b);
        }

        if(a instanceof Float){
            return (Float)a+(Float)b;
        }
        else{
            return (String)a+(String)b;
        }
    }
}
