package com.konakart.app;
//Edit for VERITA- 65
/**
 *  The KonaKart Custom Engine - Custom - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class Custom
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public Custom(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public String custom(String input1, String input2) throws KKException
     {
         return kkEng.custom(input1, input2);
     }
}
