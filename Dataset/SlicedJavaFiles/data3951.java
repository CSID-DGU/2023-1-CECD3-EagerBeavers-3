public class Main{    public static void main(String[] args) {
		Escanear escanear = new Escanear();
        int proximoInt = escanear.proximoNum();
        double proximoDouble = escanear.proximoNum();
        long[] aux = new long[proximoInt];
        for(Integer i = 0; i < proximoInt; i++) {
            for(Integer j =0; j < proximoInt; j++) {
                Integer val = escanear.proximoNum();
                if (val.equals(1) || i.equals(j)) {
				 aux[i] |= 1L << j;
				}
            }
        }

        int esquerda = proximoInt/2;
        int direita = proximoInt - esquerda;

        int[] depois = new int[1 << esquerda];
        int maiorMascara = 1 << esquerda;

        for(int mascara = 1; mascara <maiorMascara; mascara++) {
            int mascaraAtual = mascara;

            for(int j = 0; j < esquerda; j++) {
                if (((1 << j) & mascara) > 0) {
                    mascaraAtual &= aux[j + direita] >> direita;
                    depois[mascara] = Math.max(depois[mascara], depois[mascara ^ (1 << j)]);
                }
            }
            if (mascara == mascaraAtual) {
                depois[mascara] = Math.max(depois[mascara],Integer.bitCount(mascara));
            }
        }
        int auxiliar = 0;
        int mascaraMaxima = 1 << direita;
        for(int mascara = 0; mascara < mascaraMaxima; mascara++) {
            int mascaraCorrente = mascara;
            int mascaraValor = maiorMascara -1;
            for(int j = 0; j < direita; j++) {
                if (((1 << j) & mascara) > 0) {
                    mascaraCorrente &= (aux[j] & (mascaraMaxima-1));
                    mascaraValor &= aux[j] >> direita;
                }
            }
            if (mascaraCorrente != mascara) continue;
            auxiliar = Math.max(auxiliar, Integer.bitCount(mascara) + depois[mascaraValor]);
        }
        proximoDouble/=auxiliar;
        saida.println(proximoDouble * proximoDouble * (auxiliar * (auxiliar-1))/2);
        saida.flush();
    }
}