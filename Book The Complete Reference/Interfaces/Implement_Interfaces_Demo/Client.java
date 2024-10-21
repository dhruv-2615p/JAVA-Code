
interface CallBack{
    void callBack(int param);
}

class Client implements CallBack{

    @Override
    public void callBack(int param) {
        System.out.println("callback called with " + param);
    }

    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces " + "may also define other members, also.");
    }

}
