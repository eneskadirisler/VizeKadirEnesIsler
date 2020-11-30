package tr.edu.medipol.yazilimaraclari.enes;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class MuhasebeProgramiTest  {

    private static final String CLASS_PATH = "tr.edu.medipol.yazilimaraclari.enes.MuhasebeProgrami$Ucret";

    final Class clazz;
    final Constructor constructor;

    public MuhasebeProgramiTest() throws Exception {
        clazz =Class.forName(CLASS_PATH);
        constructor = clazz.getDeclaredConstructor(int.class,int.class);
        constructor.setAccessible(true);
    }

    @Test
    public void ucretHesaplaTest() throws Throwable{
        MuhasebeProgrami.ucretHesapla(5,10);
        Object instance=constructor.newInstance(5,10);
        Assert.assertEquals(MuhasebeProgrami.ucretHesapla(5,10), instance);
    }

}
