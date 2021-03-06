package com.msg5g.maap.response;

import java.util.List;
@SuppressWarnings("unused")
public class MediasuploadResponse {
    private List<FileInfo> fileInfo;
    private int fileCount;
    private int totalCount;

    public static class FileInfo{
        private String url;
        private String fileName;
        private String contentType;
        private long fileSize;
        private String until;
        private String fileHashAlgorithm;
        private String fileHashValue;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public Long getFileSize() {
            return fileSize;
        }

        public void setFileSize(Long fileSize) {
            this.fileSize = fileSize;
        }

        public String getUntil() {
            return until;
        }

        public void setUntil(String until) {
            this.until = until;
        }

        public String getFileHashAlgorithm() {
            return fileHashAlgorithm;
        }

        public void setFileHashAlgorithm(String fileHashAlgorithm) {
            this.fileHashAlgorithm = fileHashAlgorithm;
        }

        public String getFileHashValue() {
            return fileHashValue;
        }

        public void setFileHashValue(String fileHashValue) {
            this.fileHashValue = fileHashValue;
        }
    }

    public List<FileInfo> getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(List<FileInfo> fileInfo) {
        this.fileInfo = fileInfo;
    }

    public int getFileCount() {
        return fileCount;
    }

    public void setFileCount(int fileCount) {
        this.fileCount = fileCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
