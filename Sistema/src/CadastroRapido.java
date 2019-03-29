//package br.com.fean.si.poo1.av2.sistemadecurso.modelo;

import java.util.HashMap;

public class CadastroRapido {

    public void cadastrarRapidoCurso (HashMap<Integer, Curso> cursos, Integer contador) {
        Integer contadorCurso = contador;

        contadorCurso ++;
        Curso cursoRapido = new Curso.CursoBuilder().setNome("Maquiagem").setId(contadorCurso).setValor(200.00).build();
        cursos.put(cursoRapido.getId(), cursoRapido);

        contadorCurso ++;
        Curso cursoRapido2 = new Curso.CursoBuilder().setNome("Cabeleireiro").setId(contadorCurso).setValor(250.00).build();
        cursos.put(cursoRapido2.getId(), cursoRapido2);

        contadorCurso ++;
        Curso cursoRapido3 = new Curso.CursoBuilder().setNome("Depilacao").setId(contadorCurso).setValor(300.00).build();
        cursos.put(cursoRapido3.getId(), cursoRapido3);

        contadorCurso ++;
        Curso cursoRapido4 = new Curso.CursoBuilder().setNome("Manicure").setId(contadorCurso).setValor(150.00).build();
        cursos.put(cursoRapido4.getId(), cursoRapido4);

    }

    public void cadastrarRapidoPessoa(HashMap<Integer, Aluno> alunos, HashMap <Integer, Funcionario> funcionarios,
                                      HashMap <Integer, Professor> professores, HashMap <Integer, Curso> cursos, Integer contador ) {
        Integer contadorPessoas = contador;

        // Map de Alunos;

        contadorPessoas++;
        Aluno alunoRapido1 = new Aluno("JUSSARA FERNANDES",45345,"12/02/1983","88179230",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido1.getMatricula(),alunoRapido1);

        contadorPessoas++;
        Aluno alunoRapido2 = new Aluno("JUVIANE LAVANDOSKI",363656,"15/11/1973","98276342",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido2.getMatricula(),alunoRapido2);

        contadorPessoas++;
        Aluno alunoRapido3 = new Aluno("KADIJA SARTORI",6567,"01/02/1990","99367346",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido3.getMatricula(),alunoRapido3);

        contadorPessoas++;
        Aluno alunoRapido4 = new Aluno("KALIANE MAROSTICA",64564,"24/10/1981","99496233",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido4.getMatricula(),alunoRapido4);

        contadorPessoas++;
        Aluno alunoRapido5 = new Aluno("KALITA OLIVEIRA",45646,"15/04/1979","34339409",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido5.getMatricula(),alunoRapido5);

        contadorPessoas++;
        Aluno alunoRapido6 = new Aluno("KAREN ELOIZA DA CUNHA",746746,"10/10/1978","988632863",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido6.getMatricula(),alunoRapido6);

        contadorPessoas++;
        Aluno alunoRapido7 = new Aluno("KAREN FORTES DOS SANTOS",4564576,"04/02/1984","98407643",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido7.getMatricula(),alunoRapido7);

        contadorPessoas++;
        Aluno alunoRapido8 = new Aluno("KARENN AYSLAN NARCIZO",46456,"17/09/1981","98225354",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido8.getMatricula(),alunoRapido8);

        contadorPessoas++;
        Aluno alunoRapido9 = new Aluno("KARINA FERREIRA DA SILVA",47474,"04/03/1997","99103272",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido9.getMatricula(),alunoRapido9);

        contadorPessoas++;
        Aluno alunoRapido10 = new Aluno("KARINA KETLEN AVILA",6356456,"18/03/1974","84278520",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido10.getMatricula(),alunoRapido10);

        contadorPessoas++;
        Aluno alunoRapido11 = new Aluno("KARINA TOGNI DOS SANTOS",47474,"27/04/1982","98214502",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido11.getMatricula(),alunoRapido11);

        contadorPessoas++;
        Aluno alunoRapido12 = new Aluno("KARINE APARECIDA DE BORTOLI",56456,"02/02/1983","99000171",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido12.getMatricula(),alunoRapido12);

        contadorPessoas++;
        Aluno alunoRapido13 = new Aluno("KARINE BATTISTI COLLELO",4646,"14/01/1985","99367436",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido13.getMatricula(),alunoRapido13);

        contadorPessoas++;
        Aluno alunoRapido14 = new Aluno("KARINY ARAUJO DE SOUSA",47474,"25/06/1994","99338089",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido14.getMatricula(),alunoRapido14);

        contadorPessoas++;
        Aluno alunoRapido15 = new Aluno("KARLA CRISTINA BARELA",456456,"12/08/1987","91320281",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido15.getMatricula(),alunoRapido15);

        contadorPessoas++;
        Aluno alunoRapido16 = new Aluno("KARLA DOS SANTOS",47474576,"08/08/1999","89148254",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido16.getMatricula(),alunoRapido16);

        contadorPessoas++;
        Aluno alunoRapido17 = new Aluno("KAROLINE FRANCA FERREIRA",4746,"07/09/1965","99321260",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido17.getMatricula(),alunoRapido17);

        contadorPessoas++;
        Aluno alunoRapido18 = new Aluno("KAROLINE MARTINEZ",4745646,"24/01/1995","96853912",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido18.getMatricula(),alunoRapido18);

        contadorPessoas++;
        Aluno alunoRapido19 = new Aluno("KAROLINE MUSSNICH BRAULINO",4645646,"03/02/1993","99333042",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido19.getMatricula(),alunoRapido19);

        contadorPessoas++;
        Aluno alunoRapido20 = new Aluno("KAROLINE PERTILE BRESSIANI",56456,"06/09/1977","84165679",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido20.getMatricula(),alunoRapido20);

        contadorPessoas++;
        Aluno alunoRapido21 = new Aluno("KAROLINY VISOLLI ARTUZI",456456,"28/06/1977","99164803",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido21.getMatricula(),alunoRapido21);

        contadorPessoas++;
        Aluno alunoRapido22 = new Aluno("KASSIA KOLOSCKE",45646,"10/08/1989","89043441",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido22.getMatricula(),alunoRapido22);

        contadorPessoas++;
        Aluno alunoRapido23 = new Aluno("KATHIUSCIA CAMARGO LINO DE MORAES",45646,"26/12/1984","99707602",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido23.getMatricula(),alunoRapido23);

        contadorPessoas++;
        Aluno alunoRapido24 = new Aluno("KATHIUSKIANI CAMARGO LINO DE MORAES",456464,"10/12/1987","99038918",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido24.getMatricula(),alunoRapido24);

        contadorPessoas++;
        Aluno alunoRapido25 = new Aluno("KATIA OLIVEIRA ARNDT",456464,"11/10/1994","99167386",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido25.getMatricula(),alunoRapido25);

        contadorPessoas++;
        Aluno alunoRapido26 = new Aluno("KATIA PATRICIA DE MELLO",45646,"19/11/1987","98191874",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido26.getMatricula(),alunoRapido26);

        contadorPessoas++;
        Aluno alunoRapido27 = new Aluno("KATLEN REGINA FERREIRA",456456,"15/02/1971","88456052",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido27.getMatricula(),alunoRapido27);

        contadorPessoas++;
        Aluno alunoRapido28 = new Aluno("KATRINE MULLER DO PRADO",45646,"21/08/1973","98234696",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido28.getMatricula(),alunoRapido28);

        contadorPessoas++;
        Aluno alunoRapido29 = new Aluno("KAUANA BERNARDI",456,"29/08/1991","33345468",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido29.getMatricula(),alunoRapido29);

        contadorPessoas++;
        Aluno alunoRapido30 = new Aluno("KAUANA DOS SANTOS MENEZES DA LUZ",564646,"20/10/1983","91893268",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido30.getMatricula(),alunoRapido30);

        contadorPessoas++;
        Aluno alunoRapido31 = new Aluno("KAUANA KOSINSKI AMARAL",6456,"09/06/1987","98175668",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido31.getMatricula(),alunoRapido31);

        contadorPessoas++;
        Aluno alunoRapido32 = new Aluno("KAUANE CZIKACZEVSKI",45646,"28/04/1999","84330092",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido32.getMatricula(),alunoRapido32);

        contadorPessoas++;
        Aluno alunoRapido33 = new Aluno("KAUANE KEROLYN MENDES VAZ",7558,"28/05/1976","99960329",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido33.getMatricula(),alunoRapido33);

        contadorPessoas++;
        Aluno alunoRapido34 = new Aluno("KAUE BORGES LACERDA",4778,"01/10/1979","88061755",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido34.getMatricula(),alunoRapido34);

        contadorPessoas++;
        Aluno alunoRapido35 = new Aluno("KAUE JAQUELINE MULLER",4564,"29/10/1989","99929723",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido35.getMatricula(),alunoRapido35);

        contadorPessoas++;
        Aluno alunoRapido36 = new Aluno("KEILA ANTUNES",456,"31/01/1988","99665950",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido36.getMatricula(),alunoRapido36);

        contadorPessoas++;
        Aluno alunoRapido37 = new Aluno("KEILA RAQUEL CORREA MATEUS",48567,"01/02/1982","99992817",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido37.getMatricula(),alunoRapido37);

        contadorPessoas++;
        Aluno alunoRapido38 = new Aluno("KEITI GABRIELI FONTOURA DA SILVA",3563456,"30/04/1987","99932036",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido38.getMatricula(),alunoRapido38);

        contadorPessoas++;
        Aluno alunoRapido39 = new Aluno("KELI MARCIANA BALDISSERA",67457,"02/10/1979","88567610",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido39.getMatricula(),alunoRapido39);

        contadorPessoas++;
        Aluno alunoRapido40 = new Aluno("KELI REGINA MACIEL",476457,"23/06/1998","99458616",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido40.getMatricula(),alunoRapido40);

        contadorPessoas++;
        Aluno alunoRapido41 = new Aluno("KELLEN CRISTINA BIANCHINI",4764747,"14/03/1994","99039469",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido41.getMatricula(),alunoRapido41);

        contadorPessoas++;
        Aluno alunoRapido42 = new Aluno("KELLEN CRISTINA ZATTA FORTES DOS SANTOS",4747,"12/07/1995","99291189",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido42.getMatricula(),alunoRapido42);

        contadorPessoas++;
        Aluno alunoRapido43 = new Aluno("KELLI TAINARA ALVES DE SOUZA",44764576,"22/08/1979","91011849",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido43.getMatricula(),alunoRapido43);

        contadorPessoas++;
        Aluno alunoRapido44 = new Aluno("KELLY TAYNARA KREN SI DE OLIVEIRA",4747,"23/10/1996","99606669",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido44.getMatricula(),alunoRapido44);

        contadorPessoas++;
        Aluno alunoRapido45 = new Aluno("KELVEN HENRIQUE LOPES",47655,"08/12/1981","99329057",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido45.getMatricula(),alunoRapido45);

        contadorPessoas++;
        Aluno alunoRapido46 = new Aluno("KELVIN SUZUKI BORDIN",46774,"27/07/1993","99842085",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido46.getMatricula(),alunoRapido46);

        contadorPessoas++;
        Aluno alunoRapido47 = new Aluno("KELVIN WUNDERVALD BAGGIO",86990,"24/04/1981","99567714",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido47.getMatricula(),alunoRapido47);

        contadorPessoas++;
        Aluno alunoRapido48 = new Aluno("KELY CAMARGO CORREA",887689,"22/11/1980","91237385",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido48.getMatricula(),alunoRapido48);

        contadorPessoas++;
        Aluno alunoRapido49 = new Aluno("KELY FERNANDA DETERS",545345,"24/10/1997","88300986",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido49.getMatricula(),alunoRapido49);

        contadorPessoas++;
        Aluno alunoRapido50 = new Aluno("KEMELY EDUARDA MOLLMANN",23425,"14/09/1998","84770585",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido50.getMatricula(),alunoRapido50);

        contadorPessoas++;
        Aluno alunoRapido51 = new Aluno("KERIN NATHANA NERES GONCALVES",63647,"14/08/1996","99066530",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido51.getMatricula(),alunoRapido51);

        contadorPessoas++;
        Aluno alunoRapido52 = new Aluno("KERLI CARPE SILVEIRA",346363,"20/11/1991","98061064",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido52.getMatricula(),alunoRapido52);

        contadorPessoas++;
        Aluno alunoRapido53 = new Aluno("KESIA CRISTINA DOS SANTOS",37363,"24/09/1992","99542533",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido53.getMatricula(),alunoRapido53);

        contadorPessoas++;
        Aluno alunoRapido54 = new Aluno("KETLEEN APARECIDA NEVES",34636,"21/03/1998","98110430",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido54.getMatricula(),alunoRapido54);

        contadorPessoas++;
        Aluno alunoRapido55 = new Aluno("KETLIN AYANNY BERGER",34532,"02/01/1991","999801314",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido55.getMatricula(),alunoRapido55);

        contadorPessoas++;
        Aluno alunoRapido56 = new Aluno("KETLIN STRAPASSON",3456785,"24/12/1986","34334994",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido56.getMatricula(),alunoRapido56);

        contadorPessoas++;
        Aluno alunoRapido57 = new Aluno("KETLYN ALANA PEREIRA",457489,"07/12/1994","99490761",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido57.getMatricula(),alunoRapido57);

        contadorPessoas++;
        Aluno alunoRapido58 = new Aluno("KEZIA GOMES DA SILVA",383925,"07/12/1994","99003655",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido58.getMatricula(),alunoRapido58);

        contadorPessoas++;
        Aluno alunoRapido59 = new Aluno("KEZIA NEGRAO DA COSTA",272828,"04/08/1971","91841177",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido59.getMatricula(),alunoRapido59);

        contadorPessoas++;
        Aluno alunoRapido60 = new Aluno("KLORONE DOS SANTOS ANTUNES",356383,"29/06/1988","98136556",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido60.getMatricula(),alunoRapido60);

        contadorPessoas++;
        Aluno alunoRapido61 = new Aluno("LAIANA MULLER",34566,"21/11/1988","98265870",contadorPessoas,"Aluno",cursos.get(1));
        alunos.put(alunoRapido61.getMatricula(),alunoRapido61);

        contadorPessoas++;
        Aluno alunoRapido62 = new Aluno("LAIS FELTRIN",7838,"26/06/1993","98305492",contadorPessoas,"Aluno",cursos.get(2));
        alunos.put(alunoRapido62.getMatricula(),alunoRapido62);

        contadorPessoas++;
        Aluno alunoRapido63 = new Aluno("LAIS FONTANIVE DA SILVA",3633,"11/03/1987","99571911",contadorPessoas,"Aluno",cursos.get(3));
        alunos.put(alunoRapido63.getMatricula(),alunoRapido63);

        contadorPessoas++;
        Aluno alunoRapido64 = new Aluno("LAIS MARINA SANTIN",35637,"27/10/1999","98224705",contadorPessoas,"Aluno",cursos.get(4));
        alunos.put(alunoRapido64.getMatricula(),alunoRapido64);

        // Map de Funcion�rios;

        contadorPessoas++;
        Funcionario funcionarioRapido1 = new Funcionario ("LARISSA APARECIDA CASTILHO KOPSEL",6380,"19/10/1996","99028238",contadorPessoas,"Funcionario","08/09/2014",2000.0);
        funcionarios.put(funcionarioRapido1.getMatricula(), funcionarioRapido1);

        contadorPessoas++;
        Funcionario funcionarioRapido2 = new Funcionario ("LARISSA APARECIDA DA SILVA",925,"12/05/1992","98120847",contadorPessoas,"Funcionario","24/10/2014",1000.0);
        funcionarios.put(funcionarioRapido2.getMatricula(), funcionarioRapido2);

        // Map de Professores;

        contadorPessoas++;
        Professor professorRapido1 = new Professor ("LAIS ROSA FIGUEIREDO GONCALVES",596,"08/02/1996","99615540",contadorPessoas,"Professor","26/04/2017",1500.0,"Maquiagem");
        professores.put(professorRapido1.getMatricula(), professorRapido1);

        contadorPessoas++;
        Professor professorRapido2 = new Professor ("LAISA GECIELE GALVAO",6999,"13/07/1970","98326525",contadorPessoas,"Professor","01/12/2016",1500.0,"Cabeleireiro");
        professores.put(professorRapido2.getMatricula(), professorRapido2);

        contadorPessoas++;
        Professor professorRapido3 = new Professor ("LARI ALECIO TIRELLI",5990,"15/11/1995","99057901",contadorPessoas,"Professor","24/10/2016",1500.0,"Depila��o");
        professores.put(professorRapido3.getMatricula(), professorRapido3);

        contadorPessoas++;
        Professor professorRapido4 = new Professor ("LARISSA  BADIA ORLANDI",4941,"27/12/1982","99289616",contadorPessoas,"Professor","26/10/2015",1500.0,"Manicure");
        professores.put(professorRapido4.getMatricula(), professorRapido4);
    }

    public void cadastrarRapidoTurma(HashMap<Integer, Aluno> alunos, HashMap<Integer, Professor> professores, HashMap<Integer, Curso> cursos , HashMap<Integer, Turma> turmas ,Integer contador) {
        Integer contadorTurma = contador;
        HashMap<Integer, Aluno> alunosTotal = alunos;
        HashMap<Integer, Professor> professoresTotal = professores;
        HashMap<Integer, Curso> cursosTotal = cursos;
        HashMap<Integer, Turma> turmasTotal = turmas;
        Curso cursoTurma = null;

        Professor professorTurma = null;


        for (int i = 1; i < 5; i++) {
            HashMap<Integer, Aluno> alunosTurma = new HashMap<>();
            Integer matriculados = 0;

            contadorTurma++;
            for (Curso curso : cursosTotal.values()) {
                if(curso.getId().equals(i)) {
                    cursoTurma =curso;
                }
            }

            String dataInicioTurma = "13/12/2017";
            String nome = cursoTurma.getNome() + " - " + dataInicioTurma;

            for (Aluno aluno : alunosTotal.values()) {
                if(aluno.getCursoMatriculado().getId().equals(i)) {
                    matriculados++;
                    alunosTurma.put(aluno.getMatricula(), aluno );
                }
            }

            for (Professor professor: professoresTotal.values()) {
                if(i == 1) {
                    Integer cpfProfessor = 596;
                    if(professor.getCpf().equals(cpfProfessor)) {
                        professorTurma = professor;
                    }
                } else if (i == 2){
                    Integer cpfProfessor = 6999;
                    if(professor.getCpf().equals(cpfProfessor)) {
                        professorTurma = professor;
                    }
                } else if (i == 3){
                    Integer cpfProfessor = 5990;
                    if(professor.getCpf().equals(cpfProfessor)) {
                        professorTurma = professor;
                    }
                } else if (i == 4) {
                    Integer cpfProfessor = 4941;
                    if(professor.getCpf().equals(cpfProfessor)) {
                        professorTurma = professor;
                    }
                }
            }

            Turma turmasRapida = new Turma.TurmaBuilder().setId(contadorTurma).setCursoTurma(cursoTurma).setDataInicio(dataInicioTurma).setNome(nome).setAlunosTurma(alunosTurma).setProfessorTurma(professorTurma).setMatriculado(matriculados).build();
            turmasTotal.put(turmasRapida.getId(), turmasRapida);

        }
    }
}

