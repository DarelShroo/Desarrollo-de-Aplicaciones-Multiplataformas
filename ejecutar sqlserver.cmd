@echo off
sc start MSSQLSERVER
sc start SQLBrowser
sc start SQLWriter

sc stop OracleJobSchedulerXE
sc stop OracleOraDB18Home1MTSRecoveryService
sc stop OracleOraDB18Home1TNSListener
sc stop OracleServiceXE
sc stop OracleVssWriterXE