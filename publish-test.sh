mvn clean package -Ptest
cp -r ./activity/target/jsw/app-activity-service C:/Users/pc340/Desktop/apps
cp -r ./content/target/jsw/app-content-service C:/Users/pc340/Desktop/apps
cp -r ./live/target/jsw/app-live-service C:/Users/pc340/Desktop/apps
cp -r ./search/target/jsw/app-search-service C:/Users/pc340/Desktop/apps
cp -r ./io/target/jsw/app-io-service C:/Users/pc340/Desktop/apps
cp -r ./user/target/jsw/app-user-service C:/Users/pc340/Desktop/apps
cp -r ./cache/target/jsw/app-cache-service C:/Users/pc340/Desktop/apps
cp -r ./sms/target/jsw/app-sms-service C:/Users/pc340/Desktop/apps
cp -r ./monitor/target/jsw/app-monitor-service C:/Users/pc340/Desktop/apps
cp -r ./sns/target/jsw/app-sns-service C:/Users/pc340/Desktop/apps
cp -r ./kafka/target/jsw/app-kafka-service C:/Users/pc340/Desktop/apps

echo '##############################################################'
echo '#                            success                         #'
echo '##############################################################'


