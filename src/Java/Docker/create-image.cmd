docker build --no-cache -f SQL\Dockerfile.PostgreSql -t prilozhenie_03-java/postgre-sql ../../SQL

docker build --no-cache -f Dockerfile -t prilozhenie_03-java/app ../../..
