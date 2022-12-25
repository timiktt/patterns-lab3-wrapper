import java.util.*;
public class wrapperList {
    private String name;
    private ArrayList<wrapperList> list;
    {
        list = new ArrayList<>();
    }
    public void addCascade(String newNameCascade){
        if(newNameCascade.contains(".")){
            int index_point = newNameCascade.indexOf(".");
            String cutNewNameCascade = newNameCascade.substring(0, index_point);
            wrapperList next_list = new wrapperList();
            String newCutStrName = newNameCascade.substring(index_point+1);
            if (list == null){
                list = new ArrayList<>();
            }
            if (name == null){
                name = newCutStrName;
            }else{
                String nextNameStr;
                if (newCutStrName.contains(".")){
                    int new_index = newCutStrName.indexOf(".");
                    nextNameStr = newCutStrName.substring(0,new_index);
                }else{
                    nextNameStr = newCutStrName;
                }
                for(wrapperList iter:list){
                    String wrap = iter.getNameCascade();
                    if(wrap == nextNameStr){
                        iter.addCascade(newCutStrName);
                        return;
                    }
                }
            }
            next_list.addCascade(newNameCascade.substring(index_point+1));
            list.add(next_list);
        }else {
            name = newNameCascade;
        }
    }
    public String getNameCascade(){
        return name;
    }
    public void printList(){
        System.out.print(name);
        System.out.printf("[");
        for(var iter:list){
            iter.printList();
        }
        System.out.print("]");
    }

}
