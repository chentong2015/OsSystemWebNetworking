#!/usr/bin/env bash

set -euo pipefail
which psql > /dev/null || (echoerr "The PostgreSQL client is not in your PATH" && exit 1)

export PGPASSWORD=secret_password

psql -U user1 -d secret_database -h localhost -f schema.sql
psql -U user1 -d secret_database -h localhost -f data.sql