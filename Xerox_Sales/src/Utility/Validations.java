/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import Business.Person.Person;
import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author prashantreddy
 */
public class Validations {
    
    
    public static String generateHash(String input) {
		StringBuilder hash = new StringBuilder();

		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] hashedBytes = sha.digest(input.getBytes());
			char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'a', 'b', 'c', 'd', 'e', 'f','z','p','w','k' };
			for (byte a :hashedBytes) 
                        {
				byte b = a;
				hash.append(digits[(b & 0xf0) >> 4]);
				hash.append(digits[b & 0x0f]);
			}
		} catch (NoSuchAlgorithmException e) {
			
		}

		return hash.toString();
	}
  
    public static void ToInteger(KeyEvent evt, JTextField j)
       
    {
        char c = evt.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
         (c == evt.VK_BACK_SPACE) ||
         (c == evt.VK_DELETE))) {
       JOptionPane.showMessageDialog(null, " Please Enter Integer value");
      j.setText("");
      }
    }
    
    public static void ToAlphabet(KeyEvent evt, JTextField k)
    {
        char c = evt.getKeyChar();
              if (!((c >= 'a') && (c <= 'z') ||
         (c == evt.VK_BACK_SPACE) ||
         (c == evt.VK_DELETE))) {
       JOptionPane.showMessageDialog(null, " Please Enter alphabet");
      k.setText("");
      }
    }
}

