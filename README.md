✅ Etapa 1: Clonar o projeto do GitHub
Abra o Eclipse

Vá em:

File → Import → Git → Projects from Git
Escolha:

Clone URI → Next
Cole o link do seu repositório GitHub (ex: https://github.com/seu-usuario/nome-do-projeto.git)

Clique em Next e selecione a branch (main ou master)

Escolha uma pasta local diferente (ex: projeto-para-teste)

Clique em Next

⚠️ Se aparecer "No projects found"
Isso significa que o repositório não tem os arquivos .project e .classpath, que o Eclipse usa para reconhecer como projeto Java.

Mas não tem problema! Você pode importar como General Project e configurar manualmente:

✅ Etapa 2: Importar como General Project
Vá em:

File → Import → General → Projects from Folder or Archive
Selecione a pasta clonada (projeto-para-teste)

Clique em Finish

✅ Etapa 3: Converter para Java Project
Clique com o botão direito no projeto →

Configure → Convert to Java Project
Se não aparecer:

Vá em Properties

Selecione Project Facets

Marque Java

Escolha a versão do Java (ex: 1.8, 11, 17)

Clique em Apply and Close

✅ Etapa 4: Rodar o projeto
Abra a classe principal (ex: Main.java)

Clique com o botão direito →

Run As → Java Application
