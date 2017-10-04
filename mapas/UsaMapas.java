package mapas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by caiomoraes on 04/10/17.
 */
public class UsaMapas
{
    public static void main(String[] args)
    {
        /*HashMap*/
        System.out.println("/*HashMap*/");
        Map<String, String> cadastros = new HashMap<String, String>();

        cadastros.put("fulano", "111");
        cadastros.put("cicrano", "222");
        cadastros.put("beltrano", "333");

        for (Map.Entry cadastro : cadastros.entrySet())
        {
            System.out.println("Login: " + cadastro.getKey() + "\nSenha: " + cadastro.getValue());
        }



        /*TreeMap*/
        System.out.println("/*TreeMap*/");
        //Comparator
        Comparator<String> stringComparator = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                //mudar a ordem, muda de crescente para decrescente
                return o2.compareTo(o1);
            }
        };

        Map<String, String> cadastros2 = new TreeMap<String, String>(stringComparator);

        cadastros2.put("fulano", "111");
        cadastros2.put("cicrano", "222");
        cadastros2.put("beltrano", "333");

        for (Map.Entry cadastro : cadastros2.entrySet())
        {
            System.out.println("Login: " + cadastro.getKey() + "\nSenha: " + cadastro.getValue());
        }

    }
}
