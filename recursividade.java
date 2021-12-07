public static void displayDirectoryContents(File dir) throws NoSuchAlgorithmException {
    GeraHash aplicacao;
    aplicacao = new GeraHash();
    try {
    File[] files = dir.listFiles();
        for (File file : files) {
            String caminho = file.getCanonicalPath();
            String result = aplicacao.calculaHash(caminho);
            if (file.isDirectory()) {
                System.out.println("directory:" + caminho);
                aplicacao.geraArquivo(caminho, result);
                displayDirectoryContents(file);
            }
            else {
                System.out.println("file:" + caminho + " HASH:" + result);
                aplicacao.geraArquivo(caminho, result);
            }
        }
    }
    catch (IOException e) {}
}