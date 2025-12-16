# Readme

Pour lancer le programmer avec une configuration de logger différente :

export LOGBACK_CONFIG_FILE_LOCATION=/tmp/logback.conf
java -Dlogback.configurationFile=${LOGBACK_CONFIG_FILE_LOCATION}

Format du fichier de configuration :
https://logback.qos.ch/manual/configuration.html

-Dlogback.configurationFile=logback-fileperdate.xml

Attention à bien mettre dans les "VM Options"