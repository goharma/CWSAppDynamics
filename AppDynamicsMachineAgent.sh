#!/bin/bash
#Created by Peddi
#This is the script to start appdynamicsMachineAgent under /apps/appdynamicsMachineAgent/current/

ENV=TEST_AppDynamicsMachineAgent

export JAVA_HOME=/apps/java/bin
export PATH=${JAVA_HOME}:${PATH}

APPDYNAMICS_MACHINEAGENT_HOME="/apps/appdynamicsMachineAgent/current"
APP_LIB_DIR="${APPDYNAMICS_MACHINEAGENT_HOME}/lib"

start() {
  PIDS=$(status)
  if [ $? -eq 0 ]; then
    echo "AppDynamicsMachineAgent is already running"
    return 1
  fi

  cd "${APPDYNAMICS_MACHINEAGENT_HOME}/"
java -Dappdynamics.agent.runtime.dir=${APPDYNAMICS_MACHINEAGENT_HOME} -Dappdynamics.agent.maxMetrics=500 -Dappdynamics.http.proxyHost=10.216.80.70 -Dappdynamics.http.proxyPort=3128 -jar /apps/appdynamicsMachineAgent/current/machineagent.jar >"${APPDYNAMICS_MACHINEAGENT_HOME}/logs/machine-agent.log" 2>&1 &

##  java -jar ${APPDYNAMICS_MACHINEAGENT_HOME}/machineagent.jar >"${APPDYNAMICS_MACHINEAGENT_HOME}/logs/machine-agent.log" 2>&1 &
  echo $! >"${APPDYNAMICS_MACHINEAGENT_HOME}/logs/machine-agent.pid"


  sleep 1
  PIDS=$(status)
  if [ $? -eq 0 ]; then
    echo "AppDynamicsMachineAgent successfully started"
  else
    echo "AppDynamicsMachineAgent did not start successfully"
  fi
}

stop() {
  PIDS=$(status)
  if [ $? -eq 1 ]; then
    echo "AppDynamicsMachineAgent is not running"
    return 1
  fi
  pkill -f machineagent
  echo "AppDynamicsMachineAgent sent kill signal"
 if [ $? -eq 0 ]; then
    echo "AppDynamicsMachineAgent is stopped"
        return 1
  else
        echo "AppDynamicsMachineAgent could not stop"
  fi
}

status() {
  pgrep -f machineagent
}

case $1 in
  start|stop)
    $1
    ;;
  status)
    PIDS=$(status)
    case $? in
      0)
        echo "AppDynamicsMachineAgent is running with pids" ${PIDS}
        ;;
      1)
        echo "AppDynamicsMachineAgent is not running"
        ;;
      *)
        echo "unknown error!"
        ;;
    esac
    ;;
  restart)
    stop && sleep 1 && start
    ;;
  *)
    echo "Usage: $0 start | stop | restart | status"
    ;;
esac

