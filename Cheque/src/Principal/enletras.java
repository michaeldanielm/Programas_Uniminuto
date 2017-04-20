
package Principal;

/**
 *
 * @author Michael Daniel Murillo
 */
public class enletras {
       public static String datos(int num) {
        String enletras = new String();

        if ((num / 1000000) > 0) {
            if ((num / 1000000) == 1) {
                enletras = " Un Millon " + datos(num % 1000000);
            } else {
                enletras = datos(num / 1000000) + " Millones " + datos(num % 1000000);
            }
        } else {
            if ((num / 1000) > 0) {
                if ((num / 1000) == 1) {
                    enletras = " Mil " + datos(num % 1000);
                } else {
                    enletras = datos(num / 1000) + " Mil " + datos(num % 1000);
                }
            } else {
                if ((num / 100) > 0) {
                    if ((num / 100) == 1) {
                        if ((num % 100) == 0) {
                            enletras = " Cien ";
                        } else {
                            enletras = " Ciento " + datos(num % 100);
                        }
                    } else {
                        if ((num / 100) == 5) {
                            enletras = " Quinientos " + datos(num % 100);
                        } else {
                            if ((num / 100) == 9) {
                                enletras = " Novecientos " + datos(num % 100);
                            } else {
                                enletras = datos(num / 100) + " Cientos " + datos(num % 100);
                            }
                        }
                    }
                } else {
                    if ((num / 10) > 0) {
                        switch ((int) (num / 10)) {
                            case 1:
                                switch ((int) (num % 10)) {
                                    case 0:enletras = " Diez ";break;
                                    case 1:enletras = " Once ";break;
                                    case 2:enletras = " Doce ";break;
                                    case 3:enletras = " Trece ";break;
                                    case 4:enletras = " Catorce ";break;
                                    case 5:enletras = " Quince ";break;
                                    default:enletras = " Diez y " + datos(num % 10);break;
                                }
                                break;
                            case 2:
                                switch ((int)(num % 10)){
                                    case 0: enletras = " Veinte ";break;
                                    default:enletras = " Veinti " + datos(num % 10);break;
                                }
                                break;
                            case 3:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Treinta ";break;
                                    default:enletras = " Treinta y "+ datos (num % 10);break;
                                }
                                break;
                            case 4:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Cuarenta ";break;
                                    default:enletras = " Cuarenta y "+ datos (num % 10);break;
                                }
                                break;
                            case 5:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Cincuenta ";break;
                                    default:enletras = " Cincuenta y "+ datos (num % 10);break;
                                }
                                break;
                            case 6:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Sesenta ";break;
                                    default:enletras = " Sesenta y "+ datos (num % 10);break;
                                }
                                break;  
                            case 7:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Setenta ";break;
                                    default:enletras = " Setenta y "+ datos (num % 10);break;
                                }
                                break; 
                            case 8:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Ochenta ";break;
                                    default:enletras = " Ochenta y "+ datos (num % 10);break;
                                }
                                break; 
                            case 9:  
                                switch ((int)(num % 10)){
                                    case 0:enletras = " Noventa ";break;
                                    default:enletras = " Noventa y "+ datos (num % 10);break;
                                }
                                break;    
                    }
                }else{
                        switch ( (int)(num)){
                            case 0: enletras = " Cero ";break;
                            case 1: enletras = " UNo ";break;
                            case 2: enletras = " Dos ";break;
                            case 3: enletras = " Tres ";break;
                            case 4: enletras = " Cuatro ";break;
                            case 5: enletras = " Cinco ";break;
                            case 6: enletras = " Seis ";break;
                            case 7: enletras = " Siete ";break;
                            case 8: enletras = " Ocho ";break;
                            case 9: enletras = " Nueve ";break;
                        }
                    }
            }
        }
    }
    return enletras ;

    }
}
