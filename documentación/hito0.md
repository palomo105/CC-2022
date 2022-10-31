# Configuración de GitHub
Primero de todo he descargado git y después he procedido a la creación del perfil de GitHub ya que no tenía uno personal, tenía uno con el correo del grado.  
Una vez creado el GitHub añadí mi nomnbre y mi correo de la UGR, añadí una imagen de perfil y los datos pedidos: nombre completo, ciudad y universidad.  
Una vez creado el perfil de GitHub procedí a crear el par de claves SSH:  
1. Antes he comprobado si ya existian las claves SSH en mi máquina con el comand ls -al ~/.ssh
2. Como esperaba no había nada ya que el ordenador es nuevo, por lo que procedí a crear el directorio para las claves mkdir $HOME/.ssh
3. Generé el conjunto de claves con ssh-keygen -t rsa -b 4096 -C migui780@gmail.com
4. El comando creó las claves pública y privada.
5. Copié en el portapapeles la clave pública con clip < ~/.ssh/id_rsa.pub
6. Y al final copíe la clave en GitHub.  
  
Incrementé la seguridad de la cuenta activando el segundo factor de autentificación via sms.
Con la configuración finalizada creé el nuevo repositorio y para editar el README requerido para le hito0 junto con la descripción del proyecto.
