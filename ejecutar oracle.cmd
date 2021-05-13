@echo off
sc stop MSSQLSERVER
sc stop SQLBrowser
sc stop SQLWriter

sc start OracleJobSchedulerXE
sc start OracleOraDB18Home1MTSRecoveryService
sc start OracleOraDB18Home1TNSListener
sc start OracleServiceXE
sc start OracleVssWriterXE