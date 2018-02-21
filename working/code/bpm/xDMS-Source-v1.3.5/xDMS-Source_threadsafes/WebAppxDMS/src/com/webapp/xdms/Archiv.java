package com.webapp.xdms;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
 
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.awt.RenderingHints;
import java.awt.image.renderable.ParameterBlock; 

import javax.activation.MimetypesFileTypeMap;
import javax.media.jai.*; 

import com.sun.media.jai.codec.*;

import java.util.Collection;
import java.util.Iterator;


/**
 * Implementation of WebApp1 component.
 *
 */
public class Archiv extends AbstractArchiv implements Servlet {
	//private String TMP_DIR_PATH = "/Users/Pieter/Downloads/xDMS/TMP";
	private String TMP_DIR_PATH = "C:\\TMP";
    
	//private String DESTINATION_DIR_PATH ="/Users/Pieter/Downloads/xDMS";
	private String DESTINATION_DIR_PATH ="C:\\TMP\\Files";
	
	static final int BUFFER_SIZE = 16384;
	
	protected int in_maxWidth = 0;
	protected byte[] out_data = null;

	/**
	 * @see Archiv#uploader()
	 */
	public Archiv() {
		super();
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		//super.init(config);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		return null;
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {

		PrintWriter out;
		File destinationDir;
		File tmpDir;
		String sep = File.separator;
		String xfunc = request.getParameter("xfunc");
		String folderID = request.getParameter("folderid");
		String fileID = request.getParameter("fileid");
		String linkTarget = "";
		String slinkTarget = "";
		if (request.getParameter("target") != null) {
			linkTarget = "target=" + request.getParameter("target");
			slinkTarget = "&target=" + request.getParameter("target");
		}

		double in_maxWidth = 400;
		try {
			in_maxWidth = Double.valueOf(request.getParameter("scale"))
					.doubleValue();
		} catch (Exception e) {
		}

		boolean iswithUpload = false;
		try {
			iswithUpload = request.getParameter("xupload").equals("true");
		} catch (Exception e) {
		}

		TMP_DIR_PATH = this.getRootFilePathTemp();
	    DESTINATION_DIR_PATH =this.getRootFilePath();

		tmpDir = new File(TMP_DIR_PATH);
		if (!tmpDir.isDirectory()) {
			// tmpDir.mkdir();
			throw new ServletException(TMP_DIR_PATH + " is not a directory");
		}

		// String realPath =
		// getServletContext().getRealPath(DESTINATION_DIR_PATH);
		String realPath = DESTINATION_DIR_PATH + sep + folderID;
		destinationDir = new File(realPath);

		if (!destinationDir.isDirectory()) {
			destinationDir.mkdir();
			// throw new
			// ServletException(DESTINATION_DIR_PATH+" is not a directory");
		}

		// *** start list
		if (xfunc.equals("list")) {

			try {
				out = response.getWriter();
				writeHeaderResponse(out, "LIST", folderID, fileID);
				response.setContentType("text/html");

				String[] extensions = { "doc", "docx", "txt", "jpg", "jpeg",
						"tif", "pdf", "xls", "xlsx", "zip", "ppt", "pptx",
						"png", "wmv", "mp4", "bmp", "7z", "log", "html", "gif",
						"xml", "csv" };
				boolean recursive = false;

				Collection files = FileUtils.listFiles(destinationDir,
						extensions, recursive);
				out.println("<div style='width:99%; height:200px; overflow: auto;'>");
				out.println("<table width='98%' class='tabular' cellspacing='0' border='0'>");
				out.println("<thead><tr>");
				out.println("<th align='left'>Filename</th>"
						+ "<th align='left'>Size</th>"
						+ "<th align='left'>lastModified</th>");
				out.println("</thead></tr>");

				for (Iterator iterator = files.iterator(); iterator.hasNext();) {
					File file = (File) iterator.next();

					String extension = getFileExt(file);

					out.println("<tbody><tr>");
					// Link if TIFF file
					// out.println("<td>" + new
					// MimetypesFileTypeMap().getContentType(file) + "</td>");
					// out.println("<td>" + file.getPath() + "</td>");
					if (new MimetypesFileTypeMap().getContentType(file).equals(
							"image/tiff")) {
						out.println("<td>"
								+ "<a href='archiv?xfunc=TIFFViewer&folderid="
								+ folderID + "&fileid=" + file.getName()
								+ "&xupload=" + iswithUpload + "'" + linkTarget
								+ ">" + file.getName() + "</a>" + "</td>");
					} else if (extension.equals("pdf")) {
						out.println("<td>"
								+ "<a href='archiv?xfunc=PDFViewer&folderid="
								+ folderID + "&fileid=" + file.getName()
								+ "&xupload=" + iswithUpload + "'" + linkTarget
								+ ">" + file.getName() + "</a>" + "</td>");
					} else if (extension.equals("jpg")
							|| extension.equals("png")
							|| extension.equals("gif")
							|| extension.equals("bmp")
							|| extension.equals("jpeg")
							|| extension.equals("html")
							|| extension.equals("xml")
							|| extension.equals("txt")
							|| extension.equals("csv")
							|| extension.equals("log")) {
						out.println("<td>"
								+ "<a href='archiv?xfunc=IMGViewer&folderid="
								+ folderID + "&fileid=" + file.getName()
								+ "&xupload=" + iswithUpload + "'" + linkTarget
								+ ">" + file.getName() + "</a>" + "</td>");
					} else {
						// Link if normal downloadable file
						out.println("<td>"
								+ "<a href='archiv?xfunc=download&folderid="
								+ folderID + "&fileid=" + file.getName() + "'>"
								+ file.getName() + "</a>" + "</td>");
					}
					// Size
					DecimalFormat dc = new DecimalFormat("#.##");
					out.println("<td>" + dc.format(file.length() / 1000)
							+ " k </td>");
					// Date
					Date lastModified = new Date(file.lastModified());
					SimpleDateFormat df = new SimpleDateFormat(
							"dd.MM.yyyy HH:mm:ss");
					out.println("<td>" + df.format(lastModified) + "</td>");
					out.println("</tr></tbody>");
				}

				if (iswithUpload) {
					out.println("<tr><td colspan=3>");
					out.println("<a href='archiv?xfunc=uploader&folderid="
							+ folderID
							+ "&xupload="
							+ iswithUpload
							+ slinkTarget
							+ "' title='Upload'> <img src='images/fileupload.gif' alt='Upload' border=0></a>");
					out.println("</td></tr>");
				}
				out.println("</table>");
				out.println("</div>");

				writeFooterResponse(out);
				out.close();
			} catch (Exception e) {
				log("Error in list", e);
			}
		} // *** end list

		// *** start TIFFViewer
		if (xfunc.equals("TIFFViewer")) {
			out = response.getWriter();
			writeHeaderResponse(out, "TIF", folderID, fileID);
			response.setContentType("text/html");

			out.println("<SCRIPT LANGUAGE='JavaScript'> var scale="
					+ in_maxWidth
					+ "; function xscale(){ scale=scale+40; return scale; }; function yscale(){ scale=scale-40; return scale; };</SCRIPT> ");
			out.println("<table class='tabular' border=0><tr width=520 height=18px>");
			out.println("<td colspan=0>");
			out.println("<img onclick=document.getElementById('curTIFF').src='archiv?xfunc=downloadTIFF&folderid="
					+ folderID
					+ "&fileid="
					+ fileID
					+ "&scale='+xscale(); src='images/ZoomIn.gif' border=0 alt='Zoom in' />");
			out.println("<img onclick=document.getElementById('curTIFF').src='archiv?xfunc=downloadTIFF&folderid="
					+ folderID
					+ "&fileid="
					+ fileID
					+ "&scale='+yscale(); src='images/ZoomOut.gif' border=0 alt='Zoom out' />");
			out.println("</td><td>");
			out.println("<a href='archiv?xfunc=list&folderid="
					+ folderID
					+ "&xupload="
					+ iswithUpload
					+ slinkTarget
					+ "'> <img src='images/matrixlist.gif' alt='FileList' border=0></a>");
			out.println("</td>");
			out.println("</tr><tr>");
			out.println("<td width=451>");
			out.println("<div style='height:600px;width:450px;overflow:scroll;'>");
			out.println("<img id=curTIFF src='archiv?xfunc=downloadTIFF&folderid="
					+ folderID
					+ "&fileid="
					+ fileID
					+ "&scale="
					+ in_maxWidth
					+ "' border=0 alt='TIFF' />");
			out.println("</div>");
			out.println("</td>");
			out.println("<td valign=top>");
			out.println("<img src='archiv?xfunc=downloadTIFF&folderid="
					+ folderID + "&fileid=" + fileID + "&scale=" + 70
					+ "' border=1 alt='Preview' />");
			out.println("</td>");
			out.println("</tr></table>");

			writeFooterResponse(out);
			out.close();
		} // end TIFFViewer

		// *** start PDFViewer
		if (xfunc.equals("PDFViewer")) {
			out = response.getWriter();
			writeHeaderResponse(out, "PDF", folderID, fileID);
			response.setContentType("text/html");

			out.println("<table class='tabular' border=0><tr width=520 height=18px>");
			out.println("<td colspan=0>");
			out.println("</td><td>");
			out.println("<a href='archiv?xfunc=list&folderid="
					+ folderID
					+ "&xupload="
					+ iswithUpload
					+ slinkTarget
					+ "'> <img src='images/matrixlist.gif' alt='FileList' border=0></a>");
			out.println("</td>");
			out.println("</tr><tr>");
			out.println("<td width=451>");
			out.println("<div id=mypdfdiv>");
			out.println("</div>");
			out.println("</td>");
			out.println("<td valign=top>");
			out.println("</td>");
			out.println("</tr></table>");

			writeFooterResponse(out);
			out.close();
		} // end PDFViewer

		// *** start IMGViewer
		if (xfunc.equals("IMGViewer")) {
			out = response.getWriter();
			writeHeaderResponse(out, "IMG", folderID, fileID);
			response.setContentType("text/html");

			out.println("<table class='tabular' border=0><tr width=520 height=18px>");
			out.println("<td colspan=0>");
			out.println("</td><td>");
			out.println("<a href='archiv?xfunc=list&folderid="
					+ folderID
					+ "&xupload="
					+ iswithUpload
					+ slinkTarget
					+ "'> <img src='images/matrixlist.gif' alt='FileList' border=0></a>");
			out.println("</td>");
			out.println("</tr><tr>");
			out.println("<td width=800px>");
			out.println("<iframe id=imgiframe src='archiv?xfunc=download&folderid="
					+ folderID
					+ "&fileid="
					+ fileID
					+ "' width='800px' height='600px' name=imgview alt=IMG frameborder=0>");
			out.println("</iframe>");
			out.println("</td>");
			out.println("<td valign=top>");
			out.println("</td>");
			out.println("</tr></table>");

			writeFooterResponse(out);
			out.close();
		} // end IMGViewer

		// *** start download
		if (xfunc.equals("download")) {
			try {
				File file = getFileToDownload(realPath + sep + fileID);
				prepareResponseFor((HttpServletResponse) response, file);
				streamFileTo((HttpServletResponse) response, file);

			} catch (Exception e) {
				log("Error in download", e);
			}
		} // *** end download

		// *** start download PDF
		if (xfunc.equals("downloadPDF")) {
			try {
				response.reset();
				response.setContentType("application/pdf");
				// response.setContentType("application/x-pdf");
				File file = getFileToDownload(realPath + sep + fileID);
				streamFileTo((HttpServletResponse) response, file);

			} catch (Exception e) {
				log("Error in download", e);
			}
		} // *** end download PDF

		// *** start download TIFF
		if (xfunc.equals("downloadTIFF")) {

			ServletOutputStream outs = response.getOutputStream();

			FileSeekableStream fss = new FileSeekableStream(realPath + sep
					+ fileID);
			RenderedOp originalImage = JAI.create("stream", fss);

			// now resize the image
			double scale = 1.0;
			int origImageWidth = originalImage.getWidth();

			if (in_maxWidth > 0 && origImageWidth > in_maxWidth) {
				scale = (double) in_maxWidth / origImageWidth;
			}

			ParameterBlock paramBlock = new ParameterBlock();
			paramBlock.addSource(originalImage); // The source image
			paramBlock.add(scale); // The xScale
			paramBlock.add(scale); // The yScale
			paramBlock.add(0.0); // The x translation
			paramBlock.add(0.0); // The y translation

			RenderingHints qualityHints = new RenderingHints(
					RenderingHints.KEY_RENDERING,
					RenderingHints.VALUE_RENDER_QUALITY);

			RenderedOp resizedImage = JAI.create("SubsampleAverage",
					paramBlock, qualityHints);
			// lastly, write the newly-resized image to an output stream, in a
			// specific encoding
			ByteArrayOutputStream encoderOutputStream = new ByteArrayOutputStream();

			JAI.create("encode", resizedImage, encoderOutputStream, "JPEG",
					null);
			// Export to Byte Array
			out_data = encoderOutputStream.toByteArray();
			outs.write(out_data);

			originalImage = null;
			fss.close();
			fss = null;
		} // *** end download TIFF

		// *** start uploader
		if (xfunc.equals("uploader")) {
			out = response.getWriter();
			writeHeaderResponse(out, "UPLOADER", folderID, fileID);
			response.setContentType("text/html");
			// out.println("<br>");

			out.println("<form name='dmsForm' action='archiv?xfunc=upload&folderid="
					+ folderID
					+ "&xupload="
					+ iswithUpload
					+ slinkTarget
					+ "' enctype='multipart/form-data' method='POST' onsubmit='return validateForm();' >");
			out.println("<table width='98%' class='tabular' cellspacing='0' border='0'>"
					+ "<tr><th align='left'>File:</th><th align='left'><input type='file' name='file1'></th></tr>");
			out.println("<tr><td> </td><td align='left'><input type='Submit' value='Upload File'></td></tr>");

			out.println("<tr><td colspan=3>");
			out.println("<a href='archiv?xfunc=list&folderid="
					+ folderID
					+ "&xupload="
					+ iswithUpload
					+ slinkTarget
					+ "'> <img src='images/matrixlist.gif' alt='List' border=0></a>");
			out.println("</td></tr>");
			out.println("</table>");
			out.println("</form>");

			writeFooterResponse(out);
			out.close();
		}// *** end uploader

		// *** start upload
		if (xfunc.equals("upload")) {
			out = response.getWriter();
			writeHeaderResponse(out, "UPLOAD", folderID, fileID);
			response.setContentType("text/html");

			out.println("<table width='100%' class='tabular' cellspacing='0' border='0'>");
			out.println("<tr>");
			out.println("<th align='left'>Upload</th>"
					+ "<th align='left'></th>");
			out.println("</tr>");

			try {
				DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
				fileItemFactory.setSizeThreshold(5 * 1024 * 1024); // 5 MB
				fileItemFactory.setRepository(tmpDir);

				ServletFileUpload uploadHandler = new ServletFileUpload(
						fileItemFactory);

				/*
				 * Parse the request
				 */
				List items = uploadHandler
						.parseRequest((HttpServletRequest) request);
				Iterator itr = items.iterator();
				while (itr.hasNext()) {
					FileItem item = (FileItem) itr.next();
					/*
					 * Handle Form Fields.
					 */
					if (item.isFormField()) {
						out.println("File Name = " + item.getFieldName()
								+ ", Value = " + item.getString());
					} else {

						DecimalFormat dc = new DecimalFormat("#.##");

						out.println("<tr><td>File Name</td><td>"
								+ FilenameUtils.getName(item.getName())
								+ "</td>" + "<tr><td>Content type</td><td>"
								+ item.getContentType() + "</td>"
								+ "<tr><td>File Size</td><td>"
								+ dc.format(item.getSize() / 1000) + " k </td>");

						// Write file to the ultimate location.
						File file = new File(destinationDir,
								FilenameUtils.getName(item.getName()));
						item.write(file);
					}
				}

			} catch (FileUploadException ex) {
				log("Error encountered while uploading file - parsing the request",
						ex);
			} catch (Exception ex) {
				log("Error encountered while uploading file", ex);
			}

			out.println("<tr><td colspan=3>");
			out.println("<a href='archiv?xfunc=list&folderid="
					+ folderID
					+ "&xupload="
					+ iswithUpload
					+ slinkTarget
					+ "'> <img src='images/matrixlist.gif' alt='List' border=0></a>");
			out.println("</td></tr>");
			out.println("</table>");
			writeFooterResponse(out);
			out.close();

		}// *** end upload
	}
	
	private File getFileToDownload(String filename) {
        return new File(filename);
    }
 
    private void streamFileTo(HttpServletResponse response, File file)
            throws IOException, FileNotFoundException {
        OutputStream os = response.getOutputStream();
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = 0;
        while ((bytesRead = fis.read(buffer)) > 0) {
            os.write(buffer, 0, bytesRead);
        }
        os.flush();
        fis.close();
    }
 
    private void prepareResponseFor(HttpServletResponse response, File file) {
        StringBuilder type = new StringBuilder("attachment; filename=");
        type.append(file.getName());
        
        String extension = getFileExt(file);
        
        response.setContentLength((int) file.length());
        
        if (extension.equals("jpg") || extension.equals("jpeg")) {
        	response.setContentType("image/jpeg");
        } else if (extension.equals("png")) {
        	response.setContentType("image/png");
        } else if (extension.equals("gif")) {
        	response.setContentType("image/gif");
        } else if (extension.equals("bmp")) {
        	response.setContentType("image/bmp");
        } else if (extension.equals("html")) {
        	response.setContentType("text/html");
        } else if (extension.equals("txt") || extension.equals("csv") || extension.equals("log")) {
        	response.setContentType("text/plain");
        } else if (extension.equals("xml")) {
        	response.setContentType("application/xml");
        } else {
        	response.setContentType("application/octet-stream");
        	response.setHeader("Content-Disposition", type.toString());
        }
    }
    
    private String getFileExt(File file) {
    	String extension = "";
        int i = file.getName().lastIndexOf('.');
        if (i > 0) { extension = file.getName().substring(i+1).toLowerCase(); }
        return extension;
    }
    
    private void writeHeaderResponse(PrintWriter out, String flag, String folderID, String fileID) {
    	out.println("<!DOCTYPE html>");
    	out.println("<html lang='de'>");
    	out.println("<head>");
    	out.println("<meta charset='utf-8' />");
        out.println("<title>xDMS</title>");
        out.println("<link rel='stylesheet' href='css/main.css' type='text/css' />");
        if (flag=="PDF") {
            out.println("<script type='text/javascript' src='js/pdfobject.js'></script>");
            out.println("<script type='text/javascript'>");
            out.println("window.onload = function (){ ");
            out.println("var myPDF = new PDFObject({url: 'archiv?xfunc=downloadPDF&folderid="+folderID+"&fileid="+fileID+"',id: 'myPDF', width: '450px', height: '600px', pdfOpenParams: {navpanes: 0, statusbar: 0, toolbar: 0, view: 'FitH' }}).embed('mypdfdiv');");
            out.println("}; </script>");
        };
        if (flag=="UPLOADER") {
        out.println("<script type='text/javascript'> function validateForm() {");
        out.println("var x=document.forms['dmsForm']['file1'].value; ");
        out.println(" if (x==null || x=='') { ");
        out.println("  	  alert('File name missing. Please select a file.'); ");
        out.println(" 	  return false; ");
        out.println(" }; ");
        out.println("}; </script>");
        };
        out.println("</head>");
        out.println("<body>");
	    out.println();
    }

    private void writeFooterResponse(PrintWriter out) {
    	out.println();
        out.println("</body>");
    	out.println("</html>");
	    out.println();
    }
    
}
