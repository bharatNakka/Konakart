package com.konakart.app;
//Edit for VERITA- 186
/**
 *  The KonaKart Custom Engine - ChangePassword - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class ChangePassword
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public ChangePassword(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public void changePassword(String sessionId, String currentPassword, String newPassword) throws KKException
     {
         kkEng.changePassword(sessionId, currentPassword, newPassword);
     }
}
